public class p09_palindrome_number {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    static boolean isPalindrome(int x) {
        if (x < 0) return false;

        long reversed = 0;
        int temp = x;

        while (x != 0) {
            reversed = reversed * 10 + (x % 10);
            x /= 10;
        }

        return reversed == temp;
    }
}
