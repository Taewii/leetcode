package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p1333_filter_restaurants_by_vegan_friendly_price_and_distance {
    public static void main(String[] args) {
        System.out.println(filterRestaurants(new int[][]{
                new int[]{1, 4, 1, 40, 10},
                new int[]{2, 8, 0, 50, 5},
                new int[]{3, 8, 1, 30, 4},
                new int[]{4, 10, 0, 10, 3},
                new int[]{5, 1, 1, 15, 1},
        }, 1, 50, 10));
    }

    static List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        return Arrays.stream(restaurants)
                .filter((res) -> {
                    if (veganFriendly == 1 && res[2] == 0) return false;
                    return res[3] <= maxPrice && res[4] <= maxDistance;
                })
                .sorted((a, b) -> {
                    int sort = b[1] - a[1];
                    if (sort != 0) return sort;
                    return b[0] - a[0];
                })
                .map(a -> a[0])
                .collect(Collectors.toList());
    }
}
