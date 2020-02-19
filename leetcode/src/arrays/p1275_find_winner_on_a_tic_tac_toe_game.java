package arrays;

public class p1275_find_winner_on_a_tic_tac_toe_game {
    static int n = 3;

    public static void main(String[] args) {
        System.out.println(tictactoe(new int[][]{
                new int[]{0, 0},
                new int[]{2, 0},
                new int[]{1, 1},
                new int[]{2, 1},
                new int[]{2, 2},
        }));

        System.out.println(tictactoe(new int[][]{
                new int[]{0, 0},
                new int[]{1, 1},
                new int[]{0, 1},
                new int[]{0, 2},
                new int[]{1, 0},
                new int[]{2, 0},
        }));
    }

    static String tictactoe(int[][] moves) {
        char[][] board = new char[n][n];

        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];
            if (i % 2 == 0) {
                board[row][col] = 'X';
                if (didWin(board, row, col, 'X')) return "A";
            } else {
                board[row][col] = 'O';
                if (didWin(board, row, col, 'O')) return "B";
            }
        }

        return moves.length == n * n ? "Draw" : "Pending";
    }

    static boolean didWin(char[][] board, int row, int col, char player) {
        boolean didPlayerWin = true;
        for (int i = 0; i < n; i++) {
            if (board[row][i] != player) {
                didPlayerWin = false;
                break;
            }
        }
        if (didPlayerWin) return true;

        didPlayerWin = true;
        for (int i = 0; i < n; i++) {
            if (board[i][col] != player) {
                didPlayerWin = false;
                break;
            }
        }
        if (didPlayerWin) return true;

        if (row == col) {
            didPlayerWin = true;
            for (int i = 0; i < n; i++) {
                if (board[i][i] != player) {
                    didPlayerWin = false;
                    break;
                }
            }
            if (didPlayerWin) return true;
        }

        if (col == n - row - 1) {
            didPlayerWin = true;
            for (int i = 0; i < n; i++) {
                if (board[i][n - i - 1] != player) {
                    didPlayerWin = false;
                    break;
                }
            }

            return didPlayerWin;
        }

        return false;
    }
}
