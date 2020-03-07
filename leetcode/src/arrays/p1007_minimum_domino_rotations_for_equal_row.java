package arrays;

public class p1007_minimum_domino_rotations_for_equal_row {
    public static void main(String[] args) {
        System.out.println(minDominoRotations(new int[]{2, 1, 2, 4, 2, 2}, new int[]{5, 2, 6, 2, 3, 2}));
    }

    static int minDominoRotations(int[] a, int[] b) {
        int[] count = new int[7];
        count[a[0]] = 1;
        count[b[0]] = 1;

        for (int i = 1; i < a.length; i++) {
            if (count[a[i]] == i && (a[i] == a[i - 1] || a[i] == b[i - 1])) {
                count[a[i]]++;
            }

            if (count[b[i]] == i && (b[i] == b[i - 1] || b[i] == a[i - 1])) {
                count[b[i]]++;
            }

            if (count[a[i]] != i + 1 && count[b[i]] != i + 1) return -1;
        }

        int ans = Integer.MAX_VALUE;
        for (int num = 1; num < 7; num++) {
            if (count[num] == a.length) {
                int aCount = 0;
                int bCount = 0;
                for (int i = 0; i < a.length; i++) {
                    if (a[i] == num) aCount++;
                    if (b[i] == num) bCount++;
                }

                ans = Math.min(ans, Math.abs(a.length - Math.max(aCount, bCount)));
            }
        }

        return ans;
    }
}
