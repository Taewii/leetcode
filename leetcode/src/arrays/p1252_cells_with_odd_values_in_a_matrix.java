package arrays;

public class p1252_cells_with_odd_values_in_a_matrix {
    public static void main(String[] args) {
        System.out.println(oddCells(2, 3, new int[][]{new int[]{0, 1}, new int[]{1, 1}}));
        System.out.println(oddCells(2, 2, new int[][]{new int[]{1, 1}, new int[]{0, 0}}));
    }

    // 1 ms
    static int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];

        for (int[] op : indices) {
            for (int i = 0; i < m; i++) matrix[op[0]][i]++;
            for (int i = 0; i < n; i++) matrix[i][op[1]]++;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 != 0) ans++;
            }
        }

        return ans;
    }

    // 0 ms
//    static int oddCells(int n, int m, int[][] indices) {
//        int[] rows = new int[n];
//        int[] cols = new int[m];
//        for (int[] op : indices) {
//            rows[op[0]] = (rows[op[0]] + 1) % 2;
//            cols[op[1]] = (cols[op[1]] + 1) % 2;
//        }
//
//        int cntRow = 0, cntCol = 0;
//        for (int row : rows) if (row % 2 == 1) cntRow++;
//        for (int col : cols) if (col % 2 == 1) cntCol++;
//        return cntRow * (m - cntCol) + cntCol * (n - cntRow);
//    }
}
