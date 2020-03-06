package arrays;

import java.util.ArrayList;
import java.util.List;

public class p46_permutations {
    public static void main(String[] args) {
        permute(new int[]{1, 2, 3}).forEach(System.out::println);
    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        perm(ans, new ArrayList<>(), nums);
        return ans;
    }

    private static void perm(List<List<Integer>> ans, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
        } else {
            for (int num : nums) {
                if (temp.contains(num)) continue;
                temp.add(num);
                perm(ans, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
