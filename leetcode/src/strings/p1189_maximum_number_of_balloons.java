package strings;

public class p1189_maximum_number_of_balloons {
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maxNumberOfBalloons("leetcode"));
    }

    static int maxNumberOfBalloons(String text) {
        int[] chars = new int[26];
        for (char ch : text.toCharArray()) chars[ch - 'a']++;

        int count = 0;
        while (true) {
            for (char ch : "balloon".toCharArray()) {
                if (chars[ch - 'a'] == 0) return count;
                chars[ch - 'a']--;
            }

            count++;
        }
    }
}
