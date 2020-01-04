import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p448_find_all_numbers_disappeared_in_an_array {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 2, 2, 3, 1}));
        System.out.println(findDisappearedNumbers(new int[]{3, 4, 5, 5, 5, 5, 5, 5}));
    }

    // 22ms with sorting
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums.length == 0) return ans;
        Arrays.sort(nums);
        int prev = 0;

        for (int num : nums) {
            if (num - prev > 1) {
                for (int i = prev + 1; i < num; i++) ans.add(i);
            }
            prev = num;
        }
        for (int i = nums[nums.length - 1] + 1; i <= nums.length; i++) ans.add(i);

        return ans;
    }

    // a smarter solution - 6ms
//    static List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> ret = new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int val = Math.abs(nums[i]) - 1;
//            if (nums[val] > 0) nums[val] = -nums[val];
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) ret.add(i + 1);
//        }
//
//        return ret;
//    }
}
