package arrays;

public class p896_monotonic_array {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 2, 2, 3}));
        System.out.println(isMonotonic(new int[]{6, 5, 4, 4}));
        System.out.println(isMonotonic(new int[]{1, 3, 2}));
        System.out.println(isMonotonic(new int[]{1, 1, 1}));
    }

    static boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] > A[i + 1]) decreasing = false;
            if (A[i] < A[i + 1]) increasing = false;
        }

        return increasing || decreasing;
    }
}
