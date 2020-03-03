package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p1365_how_many_numbers_are_smaller_than_the_current_number {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{6, 5, 4, 8})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{7, 7, 7, 7})));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(sorted[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map.get(nums[i]);
        }

        return nums;
    }
}
