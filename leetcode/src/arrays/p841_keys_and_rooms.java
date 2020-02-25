package arrays;

import java.util.ArrayList;
import java.util.List;

public class p841_keys_and_rooms {
    public static void main(String[] args) {
        System.out.println(canVisitAllRooms(List.of(List.of(1), List.of(2), List.of(3), new ArrayList<>())));
        System.out.println(canVisitAllRooms(List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0))));
    }

    static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        visit(rooms.get(0), rooms, visited);

        for (boolean b : visited) if (!b) return false;
        return true;
    }

    private static void visit(List<Integer> room, List<List<Integer>> rooms, boolean[] used) {
        for (Integer r : room) {
            if (!used[r]) {
                used[r] = true;
                visit(rooms.get(r), rooms, used);
            }
        }
    }
}
