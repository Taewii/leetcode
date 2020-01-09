package arrays;

public class p26_remove_duplicates_from_a_sorted_array {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

//    static int removeDuplicates(int[] nums) {
//        int slow = 0;
//        int fast = 1;
//
//        while (slow != nums.length && fast != nums.length) {
//            if (nums[slow] >= nums[fast]) {
//                fast++;
//            } else if (nums[slow] < nums[fast] && slow + 1 == fast) {
//                slow++;
//                fast++;
//            } else {
//                int temp = nums[++slow];
//                nums[slow] = nums[fast];
//                nums[fast] = temp;
//                fast = slow + 1;
//            }
//        }
//
//        return slow + 1;
//    }
}
