package arrays;

public class p300_longest_increasing_subsequence {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    // n^2
    static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;

        for (int i = 1; i < nums.length; i++) {
            int maxVal = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxVal = Math.max(maxVal, dp[j]);
                }
            }

            dp[i] = maxVal + 1;
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    // n log n
//    public int lengthOfLIS(int[] nums) {
//        int[] dp = new int[nums.length];
//        int len = 0;
//        for (int num : nums) {
//            int i = Arrays.binarySearch(dp, 0, len, num);
//            if (i < 0) i = -(i + 1);
//            dp[i] = num;
//            if (i == len) len++;
//        }
//        return len;
//    }
}
