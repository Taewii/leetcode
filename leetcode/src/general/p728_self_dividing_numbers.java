package general;

import java.util.ArrayList;
import java.util.List;

public class p728_self_dividing_numbers {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }

    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) ans.add(i);
        }

        return ans;
    }

    private static boolean isSelfDividing(int num) {
        int n = num;
        while (n > 0) {
            int last = n % 10;
            if (last == 0 || num % last != 0) return false;
            n /= 10;
        }

        return true;
    }
}
