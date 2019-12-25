public class p27_remove_element {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2, 2, 2}, 0));
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        if (nums.length == 1 && nums[0] == val) return 0;
        if (nums.length == 1) return 1;

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

//    static int removeElement(int[] nums, int val) {
//        if (nums.length == 0) return 0;
//        if (nums.length == 1 && nums[0] == val) return 0;
//        if (nums.length == 1) return 1;
//
//        int i = 0;
//        int k = 0;
//
//        while (i < nums.length && k < nums.length) {
//            if (nums[i] != val) i++;
//            if (nums[k] != val) k++;
//
//            if (i < nums.length && k < nums.length) {
//                if (nums[i] == val && nums[k] == val) k++;
//                if (k < nums.length && nums[i] == val && nums[k] != val) {
//                    nums[i] = nums[k];
//                    nums[k] = val;
//                    i++;
//                }
//            }
//        }
//
//        return i;
//    }
}
