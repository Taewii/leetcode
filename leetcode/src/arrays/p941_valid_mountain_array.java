package arrays;

public class p941_valid_mountain_array {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{0, 2, 3, 4, 5, 2, 1, 0}));
        System.out.println(validMountainArray(new int[]{0, 2, 3, 3, 5, 2, 1, 0}));
        System.out.println(validMountainArray(new int[]{0, 2, 3, 4, 5, 2, 0, 0}));
        System.out.println(validMountainArray(new int[]{1, 3, 2}));
        System.out.println(validMountainArray(new int[]{1, 2, 3}));
        System.out.println(validMountainArray(new int[]{3, 2, 1}));
    }

    // 2 ms
    static boolean validMountainArray(int[] nums) {
        if (nums.length < 3) return false;
        boolean up = true;
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (prev == nums[i]) return false;
            if (up) {
                if (i == 1 && prev > nums[i]) return false;
                if (prev > nums[i]) up = false;
            } else if (prev < nums[i]) {
                return false;
            }
            prev = nums[i];
        }

        return !up;
    }

    // 1 ms
//    static boolean validMountainArray(int[] A) {
//        int N = A.length;
//        int i = 0;
//
//        // walk up
//        while (i + 1 < N && A[i] < A[i + 1]) i++;
//
//        // peak can't be first or last
//        if (i == 0 || i == N - 1) return false;
//
//        // walk down
//        while (i + 1 < N && A[i] > A[i + 1]) i++;
//
//        return i == N - 1;
//    }
}
