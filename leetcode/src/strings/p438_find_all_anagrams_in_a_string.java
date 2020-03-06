package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p438_find_all_anagrams_in_a_string {
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAnagrams("abab", "ab"));
    }

    static List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : p.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);

        int start = 0;
        int end = 0;
        int counter = map.size();

        List<Integer> ans = new ArrayList<>();
        while (end < s.length()) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) counter--;
            }
            end++;

            while (counter == 0) {
                char tmp = s.charAt(start);
                if (map.containsKey(tmp)) {
                    map.put(tmp, map.get(tmp) + 1);
                    if (map.get(tmp) > 0) counter++;
                }

                if (end - start == p.length()) {
                    ans.add(start);
                }

                start++;
            }
        }

        return ans;
    }
}
