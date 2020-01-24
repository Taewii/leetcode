package arrays;

import java.util.Arrays;

public class p1122_relative_sort_array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(relativeSortArray(
                new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19},
                new int[]{2, 1, 4, 3, 9, 6})));
    }

    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] countArr = new int[1001];
        for (int num : arr1) countArr[num]++;
        int idx = 0;

        for (int num : arr2) {
            while (countArr[num]-- > 0) {
                arr1[idx++] = num;
            }
        }

        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i]-- > 0) {
                arr1[idx++] = i;
            }
        }

        return arr1;
    }

//    static int[] relativeSortArray(int[] arr1, int[] arr2) {
//        Map<Integer, Integer> map = new TreeMap<>();
//        for (int n : arr1) {
//            map.put(n, map.getOrDefault(n, 0) + 1);
//        }
//
//        int i = 0;
//        for (int num : arr2) {
//            while (map.get(num) > 0) {
//                arr1[i++] = num;
//                map.put(num, map.get(num) - 1);
//            }
//        }
//
//        for (int num : map.keySet()) {
//            while (map.get(num) > 0) {
//                arr1[i++] = num;
//                map.put(num, map.get(num) - 1);
//            }
//        }
//
//        return arr1;
//    }
}
