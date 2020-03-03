package arrays;

import java.util.HashSet;
import java.util.Set;

public class p1346_check_if_n_and_its_double_exist {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{10, 2, 5, 3}));
        System.out.println(checkIfExist(new int[]{7, 1, 14, 11}));
        System.out.println(checkIfExist(new int[]{3, 1, 7, 11}));
    }

    static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
