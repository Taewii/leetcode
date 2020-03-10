package strings;

public class p05_longest_palindromic_subsequence {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ac"));
        System.out.println(longestPalindrome("b"));
        System.out.println(longestPalindrome("bb"));
    }

    // really slow
    static String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        char[] ch = s.toCharArray();

        String ans = "";
        for (int i = 0; i < ch.length; i++) {
            for (int j = i; j < ch.length; j++) {
                if (isPalindrome(ch, i, j) && j - i >= ans.length()) {
                    ans = s.substring(i, j + 1);
                }
            }
        }

        return ans;
    }

    private static boolean isPalindrome(char[] ch, int start, int end) {
        while (start <= end) {
            if (ch[start++] != ch[end--]) return false;
        }

        return true;
    }
}
