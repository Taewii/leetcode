package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p830_positions_of_large_groups {
    public static void main(String[] args) {
        System.out.println(largeGroupPositions("abbxxxxzzy"));
        System.out.println(largeGroupPositions("abcdddeeeeaabbbcd"));
        System.out.println(largeGroupPositions("abc"));
        System.out.println(largeGroupPositions("aaa"));
    }

    static List<List<Integer>> largeGroupPositions(String S) {
        char[] chars = S.toCharArray();
        int count = 1;
        int idx = 0;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[idx]) {
                count++;
            } else {
                if (count > 2) ans.add(Arrays.asList(idx, i - 1));
                count = 1;
                idx = i;
            }
        }

        if (count > 2) ans.add(Arrays.asList(idx, chars.length - 1));
        return ans;
    }
}
