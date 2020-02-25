package strings;

public class p848_shifting_letters {
    public static void main(String[] args) {
        System.out.println(shiftingLetters("abc", new int[]{3, 5, 9})); // rpl
        System.out.println(shiftingLetters("abc", new int[]{3, 345, 22551})); // trl
    }

    static String shiftingLetters(String S, int[] shifts) {
        long sum = 0;
        for (int num : shifts) sum += num;

        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (((chars[i] - 'a' + sum) % 26) + 'a');
            sum -= shifts[i];
        }

        return String.valueOf(chars);
    }
}
