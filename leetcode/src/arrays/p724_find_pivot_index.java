package arrays;

public class p724_find_pivot_index {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex(new int[]{20, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex(new int[]{1, 2, 3}));
        System.out.println(pivotIndex(new int[]{5}));
        System.out.println(pivotIndex(new int[]{2, 2, 2}));
        System.out.println(pivotIndex(new int[]{-1, -1, 0, 1, 1, 0}));
    }

    static int pivotIndex(int[] nums) {
        int startSum = 0;
        int endSum = 0;
        for (int num : nums) endSum += num;

        for (int i = 0; i < nums.length; i++) {
            startSum += nums[i];
            if (startSum == endSum) return i;
            endSum -= nums[i];
        }

        return -1;
    }
}
