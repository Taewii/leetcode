package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p1353_maximum_number_of_events_that_can_be_attended {
    public static void main(String[] args) {
        System.out.println(maxEvents(new int[][]{
                new int[]{1, 2},
                new int[]{2, 3},
                new int[]{3, 4},
        }));
    }

    static int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            return a[0] - b[0];
        });

        Set<Integer> occupied = new HashSet<>();
        for (int[] e : events) {
            for (int i = e[0]; i <= e[1]; i++) {
                if (!occupied.contains(i)) {
                    occupied.add(i);
                    break;
                }
            }
        }

        return occupied.size();
    }
}
