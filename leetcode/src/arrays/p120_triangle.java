package arrays;

import java.util.List;

public class p120_triangle {
    public static void main(String[] args) {
        System.out.println(minimumTotal(
                List.of(
                        List.of(2),
                        List.of(3, 4),
                        List.of(6, 5, 7),
                        List.of(4, 1, 8, 3)
                )));
    }

    static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];

        List<Integer> last = triangle.get(n - 1);
        for (int i = 0; i < n; i++) {
            dp[i] = last.get(i);
        }

        for (int i = n - 2; i >= 0; i--) {
            List<Integer> list = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + list.get(j);
            }
        }

        return dp[0];
    }
}
