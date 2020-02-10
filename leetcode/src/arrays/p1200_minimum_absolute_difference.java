package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p1200_minimum_absolute_difference {
    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{4, 2, 1, 3}));
        System.out.println(minimumAbsDifference(new int[]{1, 3, 6, 10, 15}));
        System.out.println(minimumAbsDifference(new int[]{3, 8, -10, 23, 19, -4, -14, 27}));
        System.out.println(minimumAbsDifference(new int[]{-25, -51, -29, -23, 57, -18}));
    }

    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int abs = Math.abs(arr[i] - arr[i + 1]);
            min = Math.min(min, abs);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) == min) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return ans;
    }
}
