package arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class p1030_matrix_cells_in_distance_order {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(allCellsDistOrder(1, 2, 0, 0)));
        System.out.println(Arrays.deepToString(allCellsDistOrder(2, 2, 0, 1)));
        System.out.println(Arrays.deepToString(allCellsDistOrder(2, 3, 1, 2)));
    }

    static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] grid = new int[R * C][];
        boolean[][] visited = new boolean[R][C];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r0, c0});

        int pos = 0;
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int row = arr[0];
            int col = arr[1];

            if (row < 0 || col < 0 || row >= R || col >= C || visited[row][col]) continue;

            grid[pos++] = arr;
            visited[row][col] = true;
            queue.offer(new int[]{row + 1, col});
            queue.offer(new int[]{row - 1, col});
            queue.offer(new int[]{row, col + 1});
            queue.offer(new int[]{row, col - 1});
        }

        return grid;
    }
}
