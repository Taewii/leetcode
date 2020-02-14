package arrays;

public class p1035_uncrossed_lines {
    public static void main(String[] args) {
        System.out.println(maxUncrossedLines(new int[]{1, 4, 2}, new int[]{1, 2, 4}));
        System.out.println(maxUncrossedLines(new int[]{2, 5, 1, 2, 5}, new int[]{10, 5, 2, 1, 5, 2}));
        System.out.println(maxUncrossedLines(new int[]{1, 3, 7, 1, 7, 5}, new int[]{1, 9, 2, 5, 1}));
    }

    static int maxUncrossedLines(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }


    // recursion with memo
//    static int maxUncrossedLines(int[] A, int[] B) {
//        Integer[][] dp = new Integer[A.length][B.length];
//        return helper(A, 0, B, 0, dp);
//    }
//
//    private static int helper(int[] A, int i, int[] B, int j, Integer[][] dp) {
//        if (i == A.length || j == B.length) return 0;
//        if (dp[i][j] != null) return dp[i][j];
//
//        if (A[i] == B[j]) {
//            dp[i][j] = 1 + helper(A, i + 1, B, j + 1, dp);
//        } else {
//            dp[i][j] = Math.max(helper(A, i + 1, B, j, dp), helper(A, i, B, j + 1, dp));
//        }
//
//        return dp[i][j];
//    }
}
