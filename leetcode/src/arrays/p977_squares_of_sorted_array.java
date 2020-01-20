package arrays;

import java.util.Arrays;

public class p977_squares_of_sorted_array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }

    static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int idx = nums.length - 1;

        int[] ans = new int[nums.length];
        while (left <= right) {
            int x = nums[left] * nums[left];
            int y = nums[right] * nums[right];

            if (x >= y) {
                ans[idx] = x;
                left++;
            } else {
                ans[idx] = y;
                right--;
            }

            idx--;
        }

        return ans;
    }
}
