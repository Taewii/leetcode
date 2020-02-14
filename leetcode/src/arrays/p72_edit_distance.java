package arrays;

public class p72_edit_distance {
    public static void main(String[] args) {
        System.out.println(minDistance("horse", "ros"));
        System.out.println(minDistance("intention", "execution"));
        System.out.println(minDistance("", ""));
    }

//    static int minDistance(String start, String goal) {
//        int m = start.length();
//        int n = goal.length();
//        int[][] dp = new int[m + 1][n + 1];
//
//        for (int i = 0; i <= m; i++) dp[i][0] = i;
//        for (int i = 1; i <= n; i++) dp[0][i] = i;
//
//        for (int row = 0; row < m; row++) {
//            for (int col = 0; col < n; col++) {
//                if (start.charAt(row) == goal.charAt(col)) {
//                    dp[row + 1][col + 1] = dp[row][col];
//                    continue;
//                }
//
//                int insert = dp[row][col];
//                int delete = dp[row + 1][col];
//                int replace = dp[row][col + 1];
//
//                dp[row + 1][col + 1] = Math.min(insert, Math.min(delete, replace)) + 1;
//            }
//        }
//
//        return dp[m][n];
//    }

    static int minDistance(String start, String goal) {
        Integer[][] dp = new Integer[start.length() + 1][goal.length() + 1];
        return helper(start, start.length(), goal, goal.length(), dp);
    }

    private static int helper(String start, int x, String goal, int y, Integer[][] dp) {
        if (x == 0 && y == 0) return 0;
        if (x == 0) return y;
        if (y == 0) return x;
        if (dp[x][y] != null) return dp[x][y];

        if (start.charAt(x - 1) == goal.charAt(y - 1)) {
            return helper(start, x - 1, goal, y - 1, dp);
        } else {
            int a = helper(start, x - 1, goal, y - 1, dp);
            int b = helper(start, x - 1, goal, y, dp);
            int c = helper(start, x, goal, y - 1, dp);
            dp[x][y] = Math.min(a, Math.min(b, c)) + 1;
        }

        return dp[x][y];
    }
}
