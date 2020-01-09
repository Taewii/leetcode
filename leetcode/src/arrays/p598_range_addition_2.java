package arrays;

public class p598_range_addition_2 {
    public static void main(String[] args) {
        System.out.println(maxCount(3, 3, new int[][]{
                new int[]{2, 2},
                new int[]{3, 3}
        }));
    }

    static int maxCount(int m, int n, int[][] ops) {
        for (int[] op : ops) {
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }

        return m * n;
    }
}
