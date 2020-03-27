package general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p1387_sort_integers_by_the_power_value {
    static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(getKth(12, 15, 2));
        System.out.println(getKth(1, 1, 1));
        System.out.println(getKth(7, 11, 4));
        System.out.println(getKth(10, 20, 5));
        System.out.println(getKth(1, 1000, 777));
    }

    // quite slow - 91ms 21%
    public static int getKth(int lo, int hi, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = lo; i <= hi; i++) {
            list.add(i);
        }

        list.sort((a, b) -> {
            int x = getPower(a, 0);
            int y = getPower(b, 0);
            memo.put(a, x);
            memo.put(b, y);
            return x - y == 0 ? a - b : x - y;
        });

        return list.get(k - 1);
    }

    private static int getPower(int n, int count) {
        if (n == 1) return count;
        if (memo.containsKey(n)) return memo.get(n) + count;
        return n % 2 == 0 ? getPower(n / 2, count + 1) : getPower(3 * n + 1, count + 1);
    }
}
