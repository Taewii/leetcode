import java.util.*;

public class p599_minimum_index_sum_of_two_lists {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRestaurant(
                new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"})));

        System.out.println(Arrays.toString(findRestaurant(
                new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"Piatti", "The Grill at Torrey Pines", "Tapioca Express", "Hungry Hunter Steakhouse", "Shogun"})));
    }

    static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int min = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i]) && map.get(list2[i]) + i <= min) {
                int cur = map.get(list2[i]) + i;
                if (cur < min) res.clear();
                res.add(list2[i]);
                min = cur;
            }
        }

        return res.toArray(new String[res.size()]);
    }
}
