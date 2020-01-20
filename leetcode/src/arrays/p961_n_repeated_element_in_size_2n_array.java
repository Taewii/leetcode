package arrays;

public class p961_n_repeated_element_in_size_2n_array {
    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{1, 2, 3, 3}));
        System.out.println(repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2}));
        System.out.println(repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4}));
    }

    static int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        int[] table = new int[10000];

        for (int num : nums) {
            if (++table[num] == n) {
                return num;
            }
        }

        return -1;
    }

//    public static int repeatedNTimes(int[] nums) {
//        for (int i = 2; i < nums.length; ++i) {
//            if (nums[i] == nums[i - 1] || nums[i] == nums[i - 2]) {
//                return nums[i];
//            }
//        }
//
//        return nums[0];
//    }
}
