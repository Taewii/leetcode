package arrays;

public class p704_binary_search {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 12));
        System.out.println(search(new int[]{5}, 5));
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int num = nums[mid];
            if (num == target) return mid;
            if (target > num) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return -1;
    }
}
