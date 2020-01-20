package arrays;

import java.util.Arrays;

public class p985_sum_of_even_numbers_after_queries {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumEvenAfterQueries(
                new int[]{1, 2, 3, 4},
                new int[][]{
                        new int[]{1, 0},
                        new int[]{-3, 1},
                        new int[]{-4, 0},
                        new int[]{2, 3},
                })));
    }

    static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        for (int num : nums) if (num % 2 == 0) sum += num;

        int pos = 0;
        int[] ans = new int[queries.length];
        for (int[] query : queries) {
            int idx = query[1];
            int val = query[0];
            int num = nums[idx];

            if ((num + val) % 2 == 0) {
                sum += num % 2 == 0 ? val : num + val;
            } else if (num % 2 == 0) {
                sum -= num;
            }

            nums[idx] += val;
            ans[pos++] = sum;
        }

        return ans;
    }
}
