package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p957_prison_cells_after_N_days {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(prisonAfterNDays(new int[]{0, 1, 0, 1, 1, 0, 0, 1}, 7)));
        System.out.println(Arrays.toString(prisonAfterNDays(new int[]{1, 0, 0, 1, 0, 0, 1, 0}, 1000000000)));
    }

    // 5 ms
    static int[] prisonAfterNDays(int[] cells, int N) {
        Map<String, Integer> seen = new HashMap<>();

        while (N > 0) {
            int[] cells2 = new int[8];
            seen.put(Arrays.toString(cells), N--);
            for (int i = 1; i < 7; ++i) {
                cells2[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
            }

            cells = cells2;
            if (seen.containsKey(Arrays.toString(cells))) {
                N %= seen.get(Arrays.toString(cells)) - N;
            }
        }

        return cells;
    }

    // 0 ms
//    public int[] prisonAfterNDays(int[] cells, int N) {
//        for (N = (N - 1) % 14 + 1; N > 0; --N) {
//            int[] cells2 = new int[8];
//            for (int i = 1; i < 7; ++i) {
//                cells2[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
//            }
//            cells = cells2;
//        }
//        return cells;
//    }
}
