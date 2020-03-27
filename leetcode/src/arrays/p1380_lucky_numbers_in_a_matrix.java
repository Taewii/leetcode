package arrays;

import java.util.ArrayList;
import java.util.List;

public class p1380_lucky_numbers_in_a_matrix {
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{
                new int[]{1, 10, 4, 2},
                new int[]{9, 3, 8, 7},
                new int[]{15, 16, 17, 12},
        }));
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        for (int[] nums : matrix) {
            int minRow = Integer.MAX_VALUE;
            int colIndex = -1;
            for (int col = 0; col < nums.length; col++) {
                if (nums[col] < minRow) {
                    minRow = nums[col];
                    colIndex = col;
                }
            }

            boolean isLucky = true;
            for (int[] row : matrix) {
                if (row[colIndex] > minRow) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) ans.add(minRow);
        }

        return ans;
    }
}
