package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p56_merge_intervals {

    public static void main(String[] args) {
//        int[][] ans = merge(new int[][]{
//                new int[]{1, 3},
//                new int[]{2, 6},
//                new int[]{8, 10},
//                new int[]{15, 18},
//        });
//
//        int[][] ans2 = merge(new int[][]{
//                new int[]{1, 4},
//                new int[]{0, 2},
//                new int[]{3, 5},
//        });

        int[][] ans3 = merge(new int[][]{
                new int[]{1, 4},
                new int[]{0, 5},
        });
    }

    static int[][] merge(int[][] in) {
        Arrays.sort(in, (a, b) -> a[0] - b[0] != 0 ? a[0] - b[0] : a[1] - b[1]);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < in.length; i++) {
            int start = in[i][0];
            int end = in[i][1];
            for (int j = i + 1; j < in.length; j++) {
                if (in[j][0] > end) break;
                start = Math.min(start, in[j][0]);
                end = Math.max(end, in[j][1]);
                i = j;
            }

            list.add(new int[]{start, end});
        }

        return list.toArray(new int[list.size()][]);
    }
}
