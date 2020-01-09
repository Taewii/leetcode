package arrays;

public class p189_rotate_array {
    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        rotate(new int[]{-1, -100, 3, 99}, 2);
    }

    static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];

            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

//    static void rotate(int[] nums, int k) {
//        for (int i = 0; i < k % nums.length; i++) {
//            int last = nums[nums.length - 1];
//            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
//            nums[0] = last;
//        }
//    }
}
