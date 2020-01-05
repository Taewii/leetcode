public class p463_island_perimeter {
    public static void main(String[] args) {
        System.out.println(islandPerimeter(new int[][]{
                new int[]{0, 1, 0, 0},
                new int[]{1, 1, 1, 0},
                new int[]{0, 1, 0, 0},
                new int[]{1, 1, 0, 0}
        }));
    }

    static int islandPerimeter(int[][] grid) {
        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int sides = 4;

                    if (i + 1 < grid.length && grid[i + 1][j] == 1) sides--;
                    if (j + 1 < grid[i].length && grid[i][j + 1] == 1) sides--;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) sides--;
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) sides--;
                    sum += sides;
                }
            }
        }

        return sum;
    }
}
