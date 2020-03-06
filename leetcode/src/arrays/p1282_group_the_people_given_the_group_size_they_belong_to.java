package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p1282_group_the_people_given_the_group_size_they_belong_to {
    public static void main(String[] args) {
        groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3}).forEach(System.out::println);
        groupThePeople(new int[]{2, 1, 3, 3, 3, 2}).forEach(System.out::println);
    }

    static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> groups = new HashMap<>();

        for (int i = 0; i < groupSizes.length; ++i) {
            groups.putIfAbsent(groupSizes[i], new ArrayList<>());
            List<Integer> list = groups.get(groupSizes[i]);
            list.add(i);

            if (list.size() == groupSizes[i]) {
                ans.add(list);
                groups.put(groupSizes[i], new ArrayList<>());
            }
        }

        return ans;
    }
}
