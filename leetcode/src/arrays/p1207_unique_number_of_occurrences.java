package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p1207_unique_number_of_occurrences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
        System.out.println(uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }

    static boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[2001];
        Arrays.fill(count, -1001);
        for (int num : arr) {
            if (num >= 0) count[num]++;
            else count[(num * -1) + 1000]++;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 2001; i++) {
            if (count[i] == -1001) continue;
            if (!set.add(count[i])) return false;
        }

        return true;
    }
}
