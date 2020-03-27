package arrays;

import java.util.Arrays;

public class p1389_create_target_array_in_given_order {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1})));
        System.out.println(Arrays.toString(createTargetArray(new int[]{1}, new int[]{0})));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);

        for (int i = 0; i < nums.length; i++) {
            int idx = index[i];
            if (ans[idx] != -1) {
                int prev = ans[idx];
                while (idx < nums.length - 1 && ans[idx] != -1) {
                    int tmp = ans[idx + 1];
                    ans[idx + 1] = prev;
                    prev = tmp;
                    idx++;
                }
            }

            ans[index[i]] = nums[i];
        }

        return ans;
    }
}
