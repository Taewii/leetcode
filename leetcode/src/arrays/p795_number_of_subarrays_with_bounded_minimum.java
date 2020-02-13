package arrays;

public class p795_number_of_subarrays_with_bounded_minimum {
    public static void main(String[] args) {
        System.out.println(numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3));
    }

    static int numSubarrayBoundedMax(int[] A, int L, int R) {
        int count = 0;
        int ans = 0;

        for (int i = 0, j = 0; i < A.length; i++) {
            if (A[i] > R) {
                count = 0;
                j = i + 1;
            } else if (A[i] >= L) {
                count = i - j + 1;
            }

            ans += count;
        }

        return ans;
    }
}
