package arrays;

public class p59_spiral_matrix_2 {
    public static void main(String[] args) {
        int[][] ans = generateMatrix(5);
    }

    static int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];

        int r = 0;
        int c = 0;
        int num = 1;
        int i = 0;

        while (num <= n * n) {
            while (c < n - i) a[r][c++] = num++;
            r++;
            c--;
            while (r < n - i) a[r++][c] = num++;
            r--;
            c--;
            while (c >= i) a[r][c--] = num++;
            r--;
            c++;
            i++;
            while (r >= i) a[r--][c] = num++;
            r++;
            c++;
        }

        return a;
    }
}
