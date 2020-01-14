package arrays;

public class p832_flipping_an_image {
    public static void main(String[] args) {
        int[][] res1 = flipAndInvertImage(new int[][]{
                new int[]{1, 1, 0},
                new int[]{1, 0, 1},
                new int[]{0, 0, 0},
        });

        int[][] res2 = flipAndInvertImage(new int[][]{
                new int[]{1, 1, 0, 0},
                new int[]{1, 0, 0, 1},
                new int[]{0, 1, 1, 1},
                new int[]{1, 0, 1, 0},
        });
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] arr : image) flipAndInvert(arr);
        return image;
    }

    private static void flipAndInvert(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
    }
}
