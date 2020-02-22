package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class p1329_sort_the_matrix_diagonally {
    public static void main(String[] args) {
        int[][] ints = diagonalSort(new int[][]{
                new int[]{3, 3, 1, 1},
                new int[]{2, 2, 1, 2},
                new int[]{1, 1, 1, 2},
        });
    }

    static int[][] diagonalSort(int[][] mat) {
        Map<Integer, Queue<Integer>> map = new HashMap<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                map.putIfAbsent(i - j, new PriorityQueue<>());
                map.get(i - j).offer(mat[i][j]);
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = map.get(i - j).poll();
            }
        }

        return mat;
    }
}
