import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p349_intersection_of_two_arrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
        System.out.println(Arrays.toString(intersection(new int[]{0}, new int[]{1})));
    }

//    static int[] intersection(int[] nums1, int[] nums2) {
//        Set<Integer> first = new HashSet<>();
//        Set<Integer> second = new HashSet<>();
//
//        for (int value : nums1) first.add(value);
//        for (int value : nums2) second.add(value);
//        first.retainAll(second);
//
//        int [] output = new int[first.size()];
//        int idx = 0;
//        for (int s : first) output[idx++] = s;
//
//        return output;
//    }

    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> intersections = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while (p1 < nums1.length && p2 < nums2.length) {
            while (p1 < nums1.length && nums1[p1] < nums2[p2]) p1++;
            while (p1 < nums1.length && p2 < nums2.length && nums1[p1] > nums2[p2]) p2++;

            if (p1 < nums1.length && p2 < nums2.length && nums1[p1] == nums2[p2]) {
                int intersection = nums1[p1];
                intersections.add(intersection);
                while (p1 < nums1.length && nums1[p1] == intersection) p1++;
                while (p2 < nums2.length && nums2[p2] == intersection) p2++;
            }
        }

        int[] result = new int[intersections.size()];
        for (int i = 0; i < intersections.size(); i++) {
            result[i] = intersections.get(i);
        }

        return result;
    }
}
