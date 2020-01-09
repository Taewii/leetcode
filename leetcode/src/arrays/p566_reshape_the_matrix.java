package arrays;

public class p566_reshape_the_matrix {
    public static void main(String[] args) {
        matrixReshape(new int[][]{
                new int[]{1, 2},
                new int[]{3, 4},
        }, 4, 1);
    }

    static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r * c != nums.length * nums[0].length) return nums;
        int[][] matrix = new int[r][c];

        int row = 0;
        int col = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = nums[row][col++];

                if (col >= nums[0].length) {
                    col = 0;
                    row++;
                }
            }
        }

        return matrix;
    }
}
