package arrays;

public class p55_jump_game {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
    }

    static boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int maxLocation = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxLocation < i) return false;
            maxLocation = Math.max(i + nums[i], maxLocation);
        }

        return true;
    }

    // accepted but barely lol - 1648 ms
//    static boolean canJump(int[] nums) {
//        return helper(nums, 0, new Boolean[nums.length]);
//    }
//
//    private static boolean helper(int[] nums, int pos, Boolean[] memo) {
//        if (pos >= nums.length - 1) return true;
//        if (memo[pos] != null) return memo[pos];
//        for (int i = 1; i <= nums[pos]; i++) {
//            memo[pos] = helper(nums, pos + i, memo);
//            if (memo[pos]) return true;
//        }
//
//        return false;
//    }
}
