package arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class p989_add_to_array_form_of_integer {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1, 2, 0, 0}, 34));
        System.out.println(addToArrayForm(new int[]{2, 7, 4}, 181));
        System.out.println(addToArrayForm(new int[]{2, 1, 5}, 806));
        System.out.println(addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1));
    }

    static List<Integer> addToArrayForm(int[] nums, int k) {
        Deque<Integer> ans = new ArrayDeque<>();
        int carry = 0;
        int i = nums.length - 1;

        while (i >= 0 || k != 0) {
            int last = 0;
            if (k != 0) {
                last = k % 10;
                k /= 10;
            }

            int num = i < 0 ? last : nums[i--] + last;
            if (carry > 0) {
                num++;
                carry--;
            }

            if (num >= 10) {
                carry++;
                num %= 10;
            }

            ans.push(num);
        }

        if (carry > 0) ans.push(1);
        return new ArrayList<>(ans);
    }
}
