package arrays;

public class p807_max_increase_to_keep_city_skyline {
    public static void main(String[] args) {
        System.out.println(maxIncreaseKeepingSkyline(
                new int[][]{
                        new int[]{3, 0, 8, 4},
                        new int[]{2, 4, 5, 7},
                        new int[]{9, 2, 6, 3},
                        new int[]{0, 3, 1, 0},
                }));
    }

    static int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxRow = new int[grid.length];
        int[] maxCol = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(max, grid[i][j]);
            }

            maxRow[i] = max;
        }

        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max, grid[j][i]);
            }

            maxCol[i] = max;
        }

        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                total += Math.min(maxRow[i], maxCol[j]) - grid[i][j];
            }
        }

        return total;
    }
}
