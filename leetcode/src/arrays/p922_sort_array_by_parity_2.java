package arrays;

import java.util.Arrays;

public class p922_sort_array_by_parity_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{1, 3, 5, 7, 9, 0, 2, 4, 6, 8})));
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{888, 505, 627, 846})));
    }

//    static int[] sortArrayByParityII(int[] nums) {
//        for (int i = 0, pointer = 0; i < nums.length; i++, pointer = i) {
//            if (i % 2 == 0) {
//                if (nums[i] % 2 == 0) continue;
//                while (pointer < nums.length - 1 && nums[pointer] % 2 != 0) pointer++;
//            } else {
//                if (nums[i] % 2 != 0) continue;
//                while (pointer < nums.length - 1 && nums[pointer] % 2 == 0) pointer++;
//            }
//
//            int tmp = nums[i];
//            nums[i] = nums[pointer];
//            nums[pointer] = tmp;
//        }
//
//        return nums;
//    }

    static int[] sortArrayByParityII(int[] nums) {
        int pointer = 1;

        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] % 2 != 0) {
                while (nums[pointer] % 2 != 0) pointer += 2;
                int tmp = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = tmp;
            }
        }

        return nums;
    }
}
