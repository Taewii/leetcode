package strings;

public class p409_longest_palindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    static int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int[] count = new int[128];
        for (char c : chars) count[c]++;

        int ans = chars.length;
        for (int value : count) {
            if (value % 2 != 0) ans--;
        }

        return ans < chars.length ? ans + 1 : ans;
    }
}
