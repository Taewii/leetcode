package arrays;

public class p1004_max_consecutive_ones_3 {
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        System.out.println(longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }

    static int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int max = 0;

        while (start < nums.length && end < nums.length) {
            if (nums[end] == 1) {
                end++;
            } else if (k > 0) {
                end++;
                k--;
            } else {
                max = Math.max(max, end - start);
                if (nums[start] == 0) k++;
                start++;
            }
        }

        return Math.max(max, end - start);
    }
}
