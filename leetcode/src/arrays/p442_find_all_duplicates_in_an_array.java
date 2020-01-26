package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p442_find_all_duplicates_in_an_array {
    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    static List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) ans.add(nums[i]);
        }

        return ans;
    }

//     the proper solution
//    static List<Integer> findDuplicates(int[] nums) {
//        List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < nums.length; ++i) {
//            int index = Math.abs(nums[i]) - 1;
//            if (nums[index] < 0) res.add(Math.abs(index + 1));
//            nums[index] = -nums[index];
//        }
//
//        return res;
//    }
}
