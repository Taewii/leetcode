package general;

public class p367_valid_perfect_square {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(14));
    }

    static boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;

        while (start < end) {
            long mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start * start == num;
    }
}
