package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p01_two_sum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }


    static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed) && map.get(needed) != i) {
                ans[0] = i;
                ans[1] = map.get(needed);
                break;
            }
        }

        return ans;
    }

//    static int[] twoSumOnePass(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int needed = target - nums[i];
//            if (map.containsKey(needed)) {
//                return new int[]{map.get(needed), i};
//            }
//            map.put(nums[i], i);
//        }
//        return new int[]{0, 0};
//    }
}
