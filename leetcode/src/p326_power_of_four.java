public class p326_power_of_four {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
    }

    static boolean isPowerOfFour(int num) {
        if (num < 1) return false;
        while (num % 4 == 0) num /= 4;
        return num == 1;
    }
}
