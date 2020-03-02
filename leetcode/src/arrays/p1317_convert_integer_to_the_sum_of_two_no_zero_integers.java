package arrays;

import java.util.Arrays;

public class p1317_convert_integer_to_the_sum_of_two_no_zero_integers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNoZeroIntegers(2)));
        System.out.println(Arrays.toString(getNoZeroIntegers(11)));
        System.out.println(Arrays.toString(getNoZeroIntegers(10000)));
    }

    static int[] getNoZeroIntegers(int n) {
        for (int i = 1; i <= n; i++) {
            if (!hasZero(i) && !hasZero(n - i)) {
                return new int[]{i, n - i};
            }
        }

        return null;
    }

    private static boolean hasZero(int num) {
        while (num > 0) {
            int last = num % 10;
            if (last == 0) return true;
            num /= 10;
        }

        return false;
    }
}
