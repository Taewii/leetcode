package general;

public class p231_power_of_two {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(218));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(2147483647));
        System.out.println(isPowerOfTwo(-2147483648));
    }

    // gotta learn bit manipulation...
    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
