package strings;

import java.util.LinkedList;

public class p1347_minimum_number_of_steps_to_make_two_strings_anagram {
    public static void main(String[] args) {
        System.out.println(minSteps("bab", "aba"));
        System.out.println(minSteps("leetcode", "practise"));
        System.out.println(minSteps("anagram", "mangaar"));
        System.out.println(minSteps("xxyyzz", "xxyyzz"));
        System.out.println(minSteps("friend", "family"));
    }

    static int minSteps(String s, String t) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        LinkedList<Integer> asd = new LinkedList<>();

        for (char ch : t.toCharArray()) {
            if (count[ch - 'a'] > 0) {
                count[ch - 'a']--;
            }
        }

        int ans = 0;
        for (int val : count) {
            ans += val;
        }

        return ans;
    }
}
