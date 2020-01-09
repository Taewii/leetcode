package general;

import java.util.HashSet;
import java.util.Set;

public class p136_single_number {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2,}));
    }

    static int singleNumber(int[] nums) {
        Set<Integer> ints = new HashSet<>();
        for (int num : nums) {
            if (ints.contains(num)) {
                ints.remove(num);
            } else {
                ints.add(num);
            }
        }

        return ints.iterator().next();
    }


    // xor
//    static int singleNumber(int[] nums) {
//        int result = 0;
//        for (int num : nums) {
//            result ^= num;
//        }
//
//        return result;
//    }
}
