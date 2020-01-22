package arrays;

import java.util.ArrayList;
import java.util.List;

public class p1089_duplicate_zeroes {
    public static void main(String[] args) {
        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
        duplicateZeros(new int[]{1, 2, 3});
    }

//    static void duplicateZeros(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                for (int j = arr.length - 1; j > i + 1; j--) {
//                    arr[j] = arr[j - 1];
//                }
//                i++;
//            }
//        }
//    }

    static void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
            if (num == 0) list.add(0);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
}
