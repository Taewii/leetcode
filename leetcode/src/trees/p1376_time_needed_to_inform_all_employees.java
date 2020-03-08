package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p1376_time_needed_to_inform_all_employees {
    public static void main(String[] args) {
        System.out.println(numOfMinutes(1, 0, new int[]{-1}, new int[]{0}));
        System.out.println(numOfMinutes(7, 6, new int[]{1, 2, 3, 4, 5, 6, -1}, new int[]{0, 6, 5, 4, 3, 2, 1}));
        System.out.println(numOfMinutes(15, 0, new int[]{-1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6}, new int[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}));
        System.out.println(numOfMinutes(4, 2, new int[]{3, 3, -1, 2}, new int[]{0, 0, 162, 914}));
    }

    static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (manager[i] == -1) continue;
            map.putIfAbsent(manager[i], new ArrayList<>());
            map.get(manager[i]).add(i);
        }

        if (!map.containsKey(headID)) return 0;
        return dfs(headID, map, informTime);
    }

    private static int dfs(int head, Map<Integer, List<Integer>> map, int[] informTime) {
        int time = informTime[head];
        int max = 0;

        if (map.containsKey(head)) {
            for (int emp : map.get(head)) {
                max = Math.max(max, dfs(emp, map, informTime));
            }
        }

        return time + max;
    }
}
