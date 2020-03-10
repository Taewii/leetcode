package arrays;

public class p64_minimum_path_sum {
    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{
                new int[]{1, 3, 1},
                new int[]{1, 5, 1},
                new int[]{4, 2, 1},
        }));
    }

    static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) dp[i][0] = dp[i - 1][0] + grid[i][0];
        for (int i = 1; i < n; i++) dp[0][i] = dp[0][i - 1] + grid[0][i];

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
//                int down = dp[i - 1][j] + grid[i][j];
//                int right = dp[i][j - 1] + grid[i][j];
//                dp[i][j] = Math.min(down, right);

                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        return dp[m - 1][n - 1];
    }
}
