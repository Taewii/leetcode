package arrays;

public class p867_transpose_matrix {
    public static void main(String[] args) {
        int[][] res1 = transpose(new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9},
        });

        int[][] res2 = transpose(new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
        });
    }

    static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }
}
