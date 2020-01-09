package arrays;

import java.util.Arrays;

public class p414_third_maximum_number {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{3, 2, 1}));
        System.out.println(thirdMax(new int[]{2, 2, 3, 1}));
        System.out.println(thirdMax(new int[]{1, 2, 2, 5, 3, 5}));
    }

    static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int prev = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != prev) {
                prev = nums[i];
                count++;
            }

            if (count == 3) break;
        }

        return count < 3 ? nums[nums.length - 1] : prev;
    }
}
