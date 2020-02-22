package strings;

public class p1328_break_a_palindrome {
    public static void main(String[] args) {
        System.out.println(breakPalindrome("abccba"));
        System.out.println(breakPalindrome("aaabaaa"));
        System.out.println(breakPalindrome("a"));
    }

    static String breakPalindrome(String palindrome) {
        char[] chars = palindrome.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != 'a') {
                chars[i] = 'a';
                return String.valueOf(chars);
            }
        }

        chars[chars.length - 1] = 'b';
        return chars.length < 2 ? "" : String.valueOf(chars);
    }
}
