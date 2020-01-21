package arrays;

public class p999_available_captures_for_rook {
    public static void main(String[] args) {
        System.out.println(numRookCaptures(new char[][]{
                new char[]{'.', '.', '.', '.', '.', '.', '.', '.'},
                new char[]{'.', '.', '.', 'p', '.', '.', '.', '.'},
                new char[]{'.', '.', '.', 'R', '.', '.', '.', 'p'},
                new char[]{'.', '.', '.', '.', '.', '.', '.', '.'},
                new char[]{'.', '.', '.', '.', '.', '.', '.', '.'},
                new char[]{'.', '.', '.', 'p', '.', '.', '.', '.'},
                new char[]{'.', '.', '.', '.', '.', '.', '.', '.'},
                new char[]{'.', '.', '.', '.', '.', '.', '.', '.'},
        }));
    }

    static int numRookCaptures(char[][] board) {
        int count = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    int row = i;
                    int col = j;

                    // I heard you like code repetitions bro
                    board[row][col] = '.';
                    while (row > 0 && board[row][col] == '.') row--;
                    if (board[row][col] == 'p') count++;
                    row = i;
                    col = j;
                    while (col > 0 && board[row][col] == '.') col--;
                    if (board[row][col] == 'p') count++;
                    row = i;
                    col = j;
                    while (row < 7 && board[row][col] == '.') row++;
                    if (board[row][col] == 'p') count++;
                    row = i;
                    col = j;
                    while (col < 7 && board[row][col] == '.') col++;
                    if (board[row][col] == 'p') count++;

                }
            }
        }

        return count;
    }
}
