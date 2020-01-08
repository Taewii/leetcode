public class p680_valid_palindrome_2 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abca"));
    }

    static boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {
                return isValid(chars, i + 1, j) || isValid(chars, i, j - 1);
            }
        }

        return true;
    }

    static boolean isValid(char[] chars, int i, int j) {
        while (i < j) {
            if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }
}
