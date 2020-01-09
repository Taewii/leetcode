package arrays;

import java.util.Arrays;

public class p532_k_diff_pairs_in_an_array {
    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{3, 1, 4, 1, 5}, 2));
        System.out.println(findPairs(new int[]{1, 2, 3, 4, 5}, 1));
        System.out.println(findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }

    static int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        int left = 0;
        int right = 1;
        int count = 0;

        Arrays.sort(nums);
        while (right < nums.length) {
            if (nums[right] - nums[left] > k) {
                left++;
            } else if (nums[right] - nums[left] < k || right == left) {
                right++;
            } else {
                count++;
                left++;
                right++;
                while (right < nums.length && nums[right] == nums[right - 1]) right++;
            }
        }

        return count;
    }
}
