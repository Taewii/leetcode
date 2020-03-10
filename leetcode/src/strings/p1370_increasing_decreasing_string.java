package strings;

public class p1370_increasing_decreasing_string {
    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));
        System.out.println(sortString("leetcode"));
        System.out.println(sortString("rat"));
        System.out.println(sortString("ggggggg"));
    }

    static String sortString(String s) {
        int[] chars = new int[26];
        for (char ch : s.toCharArray()) chars[ch - 'a']++;

        StringBuilder sb = new StringBuilder();

        int size = s.length();
        while (size > 0) {
            for (int i = 0; i < 26; i++) {
                if (chars[i] != 0) {
                    sb.append((char) (i + 'a'));
                    chars[i]--;
                    size--;
                }
            }

            for (int i = 25; i >= 0; i--) {
                if (chars[i] != 0) {
                    sb.append((char) (i + 'a'));
                    chars[i]--;
                    size--;
                }
            }
        }

        return sb.toString();
    }
}
