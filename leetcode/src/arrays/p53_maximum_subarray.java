package arrays;

public class p53_maximum_subarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); // 6
    }

    static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        System.arraycopy(nums, 0, dp, 0, nums.length);
        int max = dp[0];

        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i] + dp[i - 1];
            }

            if (dp[i] > max) max = dp[i];
        }

        return max;
    }

//    static int maxSubArray(int[] nums) {
//        int max = nums[0];
//        int curr = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            curr = nums[i] + Math.max(0, curr);
//            max = Math.max(max, curr);
//        }
//
//        return max;
//    }
}
