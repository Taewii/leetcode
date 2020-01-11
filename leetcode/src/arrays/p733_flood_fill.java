package arrays;

public class p733_flood_fill {
    public static void main(String[] args) {
        int[][] ints = floodFill(new int[][]{
                new int[]{1, 1, 1},
                new int[]{1, 1, 0},
                new int[]{1, 0, 1}
        }, 1, 1, 2);
    }

    static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private static void fill(int[][] image, int row, int col, int prevColor, int newColor) {
        if (row < 0 || col < 0 || row >= image.length || col >= image[0].length || image[row][col] != prevColor || prevColor == newColor) {
            return;
        }

        image[row][col] = newColor;
        fill(image, row + 1, col, prevColor, newColor);
        fill(image, row - 1, col, prevColor, newColor);
        fill(image, row, col + 1, prevColor, newColor);
        fill(image, row, col - 1, prevColor, newColor);
    }
}
