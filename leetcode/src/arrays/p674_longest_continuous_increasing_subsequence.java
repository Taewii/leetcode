package arrays;

public class p674_longest_continuous_increasing_subsequence {
    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        System.out.println(findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
    }

    static int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int cur = 0;
        int prev = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > prev) {
                cur++;
            } else {
                max = Math.max(cur, max);
                cur = 1;
            }
            prev = num;
        }

        return Math.max(cur, max);
    }
}
