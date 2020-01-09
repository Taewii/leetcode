package arrays;

public class p485_max_consecutive_ones {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        System.out.println(findMaxConsecutiveOnes(new int[]{0}));
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 1}));
        System.out.println(findMaxConsecutiveOnes(new int[]{1}));
        System.out.println(findMaxConsecutiveOnes(new int[]{}));
    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int max = -1;
        int current = 0;

        for (int num : nums) {
            if (num == 1) {
                current++;
            } else {
                if (current > max) max = current;
                current = 0;
            }
        }

        return Math.max(current, max);
    }
}
