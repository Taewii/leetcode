package arrays;

import java.util.HashSet;
import java.util.Set;

public class p1306_jump_game_3 {
    static boolean found;

    public static void main(String[] args) {
        System.out.println(canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 5));
        System.out.println(canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 0));
        System.out.println(canReach(new int[]{3, 0, 2, 1, 2}, 2));
    }

    static boolean canReach(int[] arr, int start) {
        found = false;
        helper(arr, start, new HashSet<>());
        return found;
    }

    static void helper(int[] arr, int pos, Set<Integer> used) {
        if (found || pos < 0 || pos >= arr.length || used.contains(pos)) return;
        if (arr[pos] == 0) {
            found = true;
            return;
        }

        used.add(pos);
        helper(arr, pos + arr[pos], used);
        helper(arr, pos - arr[pos], used);
    }
}
