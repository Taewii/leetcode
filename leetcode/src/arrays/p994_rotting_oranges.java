package arrays;

import java.util.ArrayDeque;
import java.util.Queue;

public class p994_rotting_oranges {
    public static void main(String[] args) {
        System.out.println(orangesRotting(new int[][]{
                new int[]{2, 1, 1},
                new int[]{1, 1, 0},
                new int[]{0, 1, 1},
        }));

        System.out.println(orangesRotting(new int[][]{
                new int[]{2, 1, 1},
                new int[]{0, 1, 1},
                new int[]{1, 0, 1},
        }));

        System.out.println(orangesRotting(new int[][]{
                new int[]{0, 2, 0, 1},
        }));
    }

    static int orangesRotting(int[][] grid) {
        int fresh = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{j, i});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0;

        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int minutes = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] coordinate = queue.poll();

                for (int[] dir : dirs) {
                    int x = coordinate[0] + dir[0];
                    int y = coordinate[1] + dir[1];

                    if (x < 0 || y < 0 || x >= cols || y >= rows) continue;

                    if (grid[y][x] == 1) {
                        grid[y][x] = 2;
                        queue.add(new int[]{x, y});
                        fresh--;
                    }
                }
            }
            minutes++;
        }

        return fresh > 0 ? -1 : minutes - 1;
    }
}
