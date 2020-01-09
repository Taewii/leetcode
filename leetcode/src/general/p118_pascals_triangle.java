package general;

import java.util.ArrayList;
import java.util.List;

public class p118_pascals_triangle {
    public static void main(String[] args) {
        List<List<Integer>> generate = generate(5);
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<>(i + 1);
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> prev = ans.get(i - 1);
                    int sum = prev.get(j - 1) + prev.get(j);
                    row.add(sum);
                }
            }

            ans.add(row);
        }

        return ans;
    }
}
