package arrays;

import java.util.Arrays;

public class p73_set_matrix_zeroes {
    public static void main(String[] args) {
        setZeroes(new int[][]{
                new int[]{1, 1, 1},
                new int[]{1, 0, 1},
                new int[]{1, 1, 1},
        });

        setZeroes(new int[][]{
                new int[]{0, 1, 2, 0},
                new int[]{3, 4, 5, 2},
                new int[]{1, 3, 1, 5},
        });
    }

    // this one works only if the numbers are > int max value
//    static void setZeroes(int[][] matrix) {
//        for (int i = 0; i < matrix.length; ++i) {
//            for (int j = 0; j < matrix[i].length; ++j) {
//                if (matrix[i][j] == 0) {
//                    int idx = 0;
//                    while (idx < matrix.length) {
//                        if (matrix[idx][j] != 0) matrix[idx][j] = Integer.MIN_VALUE;
//                        idx++;
//                    }
//                    idx = 0;
//                    while (idx < matrix[0].length) {
//                        if (matrix[i][idx] != 0) matrix[i][idx] = Integer.MIN_VALUE;
//                        idx++;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0; i < matrix.length; ++i) {
//            for (int j = 0; j < matrix[0].length; ++j) {
//                if (matrix[i][j] == Integer.MIN_VALUE) matrix[i][j] = 0;
//            }
//        }
//    }

    // the real solution
    static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int k = 0;
        // First row has zero?
        while (k < n && matrix[0][k] != 0) ++k;
        // Use first row/column as marker, scan the matrix
        for (int i = 1; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 0) matrix[0][j] = matrix[i][0] = 0;
            }
        }
        // Set the zeros
        for (int i = 1; i < m; ++i) {
            for (int j = n - 1; j >= 0; --j) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
            }
        }
        // Set the zeros for the first row
        if (k < n) Arrays.fill(matrix[0], 0);
    }
}
