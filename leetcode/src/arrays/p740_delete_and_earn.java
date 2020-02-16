package arrays;

public class p740_delete_and_earn {
    public static void main(String[] args) {
        System.out.println(deleteAndEarn(new int[]{3, 4, 2}));
        System.out.println(deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }

    static int deleteAndEarn(int[] nums) {
        int[] values = new int[10001];
        for (int num : nums) values[num] += num;

        int[] dp = new int[10001];
        dp[0] = values[0];
        dp[1] = values[1];

        for (int i = 2; i < 10001; i++) {
            dp[i] = Math.max(dp[i - 1], values[i] + dp[i - 2]);
        }

        return dp[10000];
    }
}
