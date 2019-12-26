import java.util.Arrays;

public class p88_merge_sorted_array {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length < m + n) return;
        int index = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[index--] = nums1[i--];
            } else {
                nums1[index--] = nums2[j--];
            }
        }

        if (i >= 0) while (i >= 0) nums1[index--] = nums1[i--];
        if (j >= 0) while (j >= 0) nums1[index--] = nums2[j--];
    }
}
