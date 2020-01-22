package arrays;

import java.util.Arrays;

public class p1051_height_checker {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
    }

    static int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);

        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if (sorted[i] != heights[i]) ans++;
        }

        return ans;
    }
}
