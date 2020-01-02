import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p350_intersection_of_two_arrays_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
        System.out.println(Arrays.toString(intersect(new int[]{0}, new int[]{1})));
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1, 2}, new int[]{2, 2, 2, 2, 2})));
    }

    static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> intersections = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while (p1 < nums1.length && p2 < nums2.length) {
            while (p1 < nums1.length && nums1[p1] < nums2[p2]) p1++;
            while (p1 < nums1.length && p2 < nums2.length && nums1[p1] > nums2[p2]) p2++;

            if (p1 < nums1.length && p2 < nums2.length && nums1[p1] == nums2[p2]) {
                intersections.add(nums1[p1]);
                p1++;
                p2++;
            }
        }

        int[] result = new int[intersections.size()];
        for (int i = 0; i < intersections.size(); i++) {
            result[i] = intersections.get(i);
        }

        return result;
    }
}
