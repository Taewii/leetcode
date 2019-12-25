public class p35_search_insert_position {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5)); // 2
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2)); // 1
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7)); // 4
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 0)); // 0
    }

    static int searchInsert(int[] nums, int target) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            if (nums[i] < target) index = i + 1;
        }

        return index;
    }

    // binary search
//    static int searchInsert(int[] nums, int target) {
//        int lo = 0;
//        int hi = nums.length - 1;
//
//        while (lo < hi) {
//            int mid = lo + (hi - lo) / 2;
//            if (nums[mid] < target) {
//                lo = mid + 1;
//            } else {
//                hi = mid;
//            }
//        }
//
//        return (nums[lo] < target) ? lo + 1 : lo;
//    }
}
