package arrays;

public class p130_surrounded_regions {
    public static void main(String[] args) {
        solve(new char[][]{
                new char[]{'X', 'X', 'X', 'X'},
                new char[]{'X', 'O', 'O', 'X'},
                new char[]{'X', 'X', 'O', 'X'},
                new char[]{'X', 'O', 'X', 'X'},
        });
    }

    static void solve(char[][] board) {
        if (board.length == 0) return;
        int row = 0;
        int col = 0;

        boolean[][] b = new boolean[board.length][board[0].length];

        while (row < board.length) {
            if (!b[row][col] && board[row][col] == 'O') {
                bfs(row, col, board, b);
            }
            row++;
        }

        row--;
        while (col < board[0].length) {
            if (!b[row][col] && board[row][col] == 'O') {
                bfs(row, col, board, b);
            }
            col++;
        }

        col--;
        while (row > 0) {
            if (!b[row][col] && board[row][col] == 'O') {
                bfs(row, col, board, b);
            }
            row--;
        }

        while (col > 0) {
            if (!b[row][col] && board[row][col] == 'O') {
                bfs(row, col, board, b);
            }
            col--;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O' && !b[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }


    private static void bfs(int row, int col, char[][] board, boolean[][] b) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length ||
                board[row][col] != 'O' || b[row][col]) return;

        b[row][col] = true;
        bfs(row - 1, col, board, b);
        bfs(row + 1, col, board, b);
        bfs(row, col - 1, board, b);
        bfs(row, col + 1, board, b);
    }
}
