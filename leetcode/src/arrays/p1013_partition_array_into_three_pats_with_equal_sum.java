package arrays;

public class p1013_partition_array_into_three_pats_with_equal_sum {
    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
        System.out.println(canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}));
        System.out.println(canThreePartsEqualSum(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}));
    }

    static boolean canThreePartsEqualSum(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;
        if (total % 3 != 0) return false;
        int part = total / 3;

        int cur = 0;
        int count = 0;

        for (int num : nums) {
            cur += num;
            if (cur == part) {
                count++;
                cur = 0;
            }
        }

        return count == 3;
    }
}
