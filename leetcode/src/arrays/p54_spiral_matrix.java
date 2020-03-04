package arrays;

import java.util.ArrayList;
import java.util.List;

public class p54_spiral_matrix {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{
                new int[]{1, 2, 3, 4},
                new int[]{5, 6, 7, 8},
                new int[]{9, 10, 11, 12},
        }));
    }

    static List<Integer> spiralOrder(int[][] a) {
        List<Integer> ans = new ArrayList<>();
        if (a.length == 0) return ans;
        int m = a.length;
        int n = a[0].length;
        int r = 0, c = 0, i = 0;

        while (ans.size() < m * n) {
            while (c < n - i) ans.add(a[r][c++]);
            r++;
            c--;
            while (r < m - i) ans.add(a[r++][c]);
            r--;
            c--;
            while (c >= i && ans.size() < m * n) ans.add(a[r][c--]);
            r--;
            c++;
            i++;
            while (r >= i && ans.size() < m * n) ans.add(a[r--][c]);
            r++;
            c++;
        }

        return ans;
    }
}
