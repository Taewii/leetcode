package arrays;

import java.util.ArrayDeque;
import java.util.Queue;

public class p542_01_matrix {
    public static void main(String[] args) {
        int[][] ints = updateMatrix(new int[][]{
                new int[]{0, 0, 0},
                new int[]{0, 1, 0},
                new int[]{1, 1, 1}
        });
    }

    static int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) queue.offer(new int[]{i, j});
                else matrix[i][j] = Integer.MAX_VALUE;
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();

            for (int[] dir : dirs) {
                int row = cell[0] + dir[0];
                int col = cell[1] + dir[1];

                if (row < 0 || row >= matrix.length
                        || col < 0 || col >= matrix[0].length
                        || matrix[row][col] <= matrix[cell[0]][cell[1]] + 1) {
                    continue;
                }

                queue.offer(new int[]{row, col});
                matrix[row][col] = matrix[cell[0]][cell[1]] + 1;
            }
        }

        return matrix;
    }
}
