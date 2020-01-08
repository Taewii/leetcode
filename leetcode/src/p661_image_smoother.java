public class p661_image_smoother {
    public static void main(String[] args) {
//        imageSmoother(new int[][]{
//                new int[]{1, 1, 1},
//                new int[]{1, 0, 1},
//                new int[]{1, 1, 1}
//        });

        imageSmoother(new int[][]{
                new int[]{1},
                new int[]{10},
                new int[]{2}
        });
    }

    static int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                int sum = 0;
                int count = 0;

                for (int k = i - 1; k <= i + 1; k++) {
                    for (int n = j - 1; n <= j + 1; n++) {
                        if (k >= 0 && k < M.length && n >= 0 && n < M[i].length) {
                            sum += M[k][n];
                            count++;
                        }
                    }
                }

                res[i][j] = sum == 0 ? 0 : sum / count;
            }
        }

        return res;
    }
}
