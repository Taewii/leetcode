package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p1002_find_common_characters {
    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"bella", "label", "roller"}));
        System.out.println(commonChars(new String[]{"cool", "lock", "cook"}));
    }

    static List<String> commonChars(String[] A) {
        int[] counts = new int[26];
        Arrays.fill(counts, Integer.MAX_VALUE);

        for (String s : A) {
            int[] tempCounts = new int[26];
            for (char c : s.toCharArray()) {
                tempCounts[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                counts[i] = Math.min(counts[i], tempCounts[i]);
            }
        }

        List<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (counts[i] > 0) {
                res.add(String.valueOf((char) (i + 'a')));
                counts[i]--;
            }
        }

        return res;
    }
}
