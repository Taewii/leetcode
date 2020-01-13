package arrays;

public class p766_toeplitz_matrix {
    public static void main(String[] args) {
        System.out.println(isToeplitzMatrix(new int[][]{
                new int[]{1, 2, 3, 4},
                new int[]{5, 1, 2, 3},
                new int[]{9, 5, 1, 2},
        }));
    }

    static boolean isToeplitzMatrix(int[][] matrix) {
        for (int row = 1; row < matrix.length; ++row) {
            for (int col = 1; col < matrix[0].length; ++col) {
                if (matrix[row - 1][col - 1] != matrix[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }
}
