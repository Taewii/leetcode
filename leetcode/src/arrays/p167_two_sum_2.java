package arrays;

import java.util.Arrays;

public class p167_two_sum_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    // pointers
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) return new int[]{start + 1, end + 1};
            if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        return null;
    }


    // hashmap
//    static int[] twoSum(int[] numbers, int target) {
//        Map<Integer, Integer> nums = new HashMap<>();
//
//        for (int i = 0; i < numbers.length; i++) {
//            int needed = target - numbers[i];
//            if (nums.containsKey(needed)) {
//                return new int[]{nums.get(needed) + 1, i + 1};
//            }
//            nums.put(numbers[i], i);
//        }
//
//        return new int[]{0, 0};
//    }
}
