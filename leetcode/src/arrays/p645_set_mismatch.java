package arrays;

import java.util.Arrays;

public class p645_set_mismatch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{4, 3, 5, 1, 2, 4})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{2, 3, 3, 4, 5})));
    }

    // O(nlogn)
    static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        int prev = 0;
        for (int num : nums) {
            if (num == prev) ans[0] = num;
            if (num - prev > 1) ans[1] = num - 1;
            prev = num;
        }

        if (ans[1] == 0) ans[1] = nums[nums.length - 1] + 1;
        return ans;
    }


    // using a new array as a hash table O(n)
//    static int[] findErrorNums(int[] nums) {
//        int[] arr = new int[nums.length + 1];
//        int dup = -1, missing = 1;
//        for (int i = 0; i < nums.length; i++) {
//            arr[nums[i]] += 1;
//        }
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] == 0)
//                missing = i;
//            else if (arr[i] == 2)
//                dup = i;
//        }
//        return new int[]{dup, missing};
//    }
}
