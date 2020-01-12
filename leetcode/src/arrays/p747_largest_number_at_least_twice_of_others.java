package arrays;

public class p747_largest_number_at_least_twice_of_others {
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{3, 6, 1, 0}));
        System.out.println(dominantIndex(new int[]{1, 2, 3, 4}));
        System.out.println(dominantIndex(new int[]{0, 0, 3, 2}));
        System.out.println(dominantIndex(new int[]{0, 0, 3, 2}));
    }

    static int dominantIndex(int[] nums) {
        int max = -100; // Every nums[i] will be an integer in the range [0, 99].
        int idx = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                idx = max * 2 <= nums[i] ? i : -1;
                max = nums[i];
            } else if (nums[i] * 2 > max) {
                idx = -1;
            }
        }

        return idx;
    }
}
