package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p496_next_greater_element_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{}, new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{1, 2, 3, 4}, new int[]{})));
    }

    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1.length == 0) return new int[0];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            int greater = -1;
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) {
                    greater = nums2[j];
                    break;
                }
            }

            map.put(nums2[i], greater);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
}
