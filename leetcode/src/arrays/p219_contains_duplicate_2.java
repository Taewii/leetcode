package arrays;

import java.util.HashMap;
import java.util.Map;

public class p219_contains_duplicate_2 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (numsMap.containsKey(num) && i - numsMap.get(num) <= k) {
                return true;
            } else {
                numsMap.put(num, i);
            }
        }

        return false;
    }
}
