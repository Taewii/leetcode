public class p326_power_of_three {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(9));
        System.out.println(isPowerOfThree(45));
    }

    static boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        while (n % 3 == 0) n /= 3;
        return n == 1;
    }

    // bruh..
//    static boolean isPowerOfThree(int n) {
//        return n > 0 && 1162261467 % n == 0;
//    }
}
