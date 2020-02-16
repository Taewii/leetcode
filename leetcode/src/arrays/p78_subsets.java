package arrays;

import java.util.ArrayList;
import java.util.List;

public class p78_subsets {
    public static void main(String[] args) {
        List<List<Integer>> subsets = subsets(new int[]{1, 2, 3});
        subsets.forEach(System.out::println);
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> subsets = new ArrayList<>();
            for (List<Integer> list : ans) {
                subsets.add(new ArrayList<>(list) {{
                    add(num);
                }});
            }

            for (List<Integer> subset : subsets) {
                ans.add(subset);
            }
        }

        return ans;
    }
}
