package arrays;

public class p289_game_of_life {
    public static void main(String[] args) {
        gameOfLife(new int[][]{
                new int[]{0, 1, 0},
                new int[]{0, 0, 1},
                new int[]{1, 1, 1},
                new int[]{0, 0, 0},
        });
    }

    static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] copy = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int cells = getCellCount(i, j, board);

                if (cells == 3) copy[i][j] = 1;
                else if (cells > 3 || cells < 2) copy[i][j] = 0;
                else copy[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = copy[i][j];
            }
        }
    }

    private static int getCellCount(int row, int col, int[][] board) {
        int r1 = Math.max(0, row - 1);
        int r2 = Math.min(board.length - 1, row + 1);
        int c1 = Math.max(0, col - 1);
        int c2 = Math.min(board[0].length - 1, col + 1);

        int count = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                if (i == row && j == col) continue;
                if (board[i][j] == 1) count++;
            }
        }

        return count;
    }
}
