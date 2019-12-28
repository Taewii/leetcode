public class p125_valid_palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

    static boolean isPalindrome(String s) {
        if (s == null) return false;
        s = s.toLowerCase();
        int n = s.length();
        int i = 0;
        int j = n - 1;

        char[] chars = s.toCharArray();
        while (i < j) {
            while (i < n && !Character.isLetterOrDigit(chars[i])) {
                i++;
            }
            while (j >= 0 && !Character.isLetterOrDigit(chars[j])) {
                j--;
            }

            if (i < j && chars[i++] != chars[j--]) {
                return false;
            }
        }

        return true;
    }

//    static boolean isPalindrome(String s) {
//        if (s.isEmpty()) return true;
//        s = s.replaceAll("[^\\w]+", "");
//        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
//    }
}
