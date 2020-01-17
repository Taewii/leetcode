package arrays;

public class p33_search_in_rotated_sorted_array {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)); // 4
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1)); // 5
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2)); // 6
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)); // -1
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4)); // 0
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5)); // 1
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 6)); // 2
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7)); // 3
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int num;
            if ((nums[mid] < nums[0]) == (target < nums[0])) {
                num = nums[mid];
            } else {
                num = target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            if (num == target) return mid;
            if (num < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
