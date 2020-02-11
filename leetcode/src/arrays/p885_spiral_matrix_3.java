package arrays;

public class p885_spiral_matrix_3 {
    public static void main(String[] args) {
        int[][] res = spiralMatrixIII(1, 4, 0, 0);
        int[][] res2 = spiralMatrixIII(5, 6, 1, 4);
    }

    static int[][] spiralMatrixIII(int R, int C, int row, int col) {
        int[][] res = new int[R * C][2];
        int dx = 0;
        int dy = 1;
        int n = 0;

        for (int i = 0; i < R * C; n++) {
            for (int j = 0; j < n / 2 + 1; j++) {
                if (row >= 0 && col >= 0 && row < R && col < C) {
                    res[i++] = new int[]{row, col};
                }
                row += dx;
                col += dy;
            }

            int tmp = dx;
            dx = dy;
            dy = -tmp;
        }

        return res;
    }
}
