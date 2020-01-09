package arrays;

public class p283_move_zeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
        moveZeroes(new int[]{0, 1, 3, 4, 0, 0, 0, 12, 0, 0});
        moveZeroes(new int[]{0, 0, 0, 1});
    }

    static void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[slow] != 0) {
                slow++;
                fast++;
                continue;
            }

            while (nums[fast] == 0) {
                fast++;
                if (fast >= nums.length) return;
            }
            nums[slow] = nums[fast];
            nums[fast] = 0;
        }
    }
}
