package arrays;

import java.util.Arrays;

public class p1313_decompress_run_length_encoded_list {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decompressRLElist(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(decompressRLElist(new int[]{1, 2, 3, 4, 6, 5})));
    }

    static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] ans = new int[size];
        for (int i = 0, j = 0; i < nums.length; i += 2) {
            while (nums[i]-- > 0) {
                ans[j++] = nums[i + 1];
            }
        }

        return ans;
    }
}
