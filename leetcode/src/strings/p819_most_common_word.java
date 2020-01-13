package strings;

import java.util.*;

public class p819_most_common_word {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }

    static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("\\W+");

        Set<String> set = new HashSet<>();
        Collections.addAll(set, banned);

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!set.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        int max = 0;
        String res = "";
        for (String str : map.keySet()) {
            if (map.get(str) > max) {
                max = map.get(str);
                res = str;
            }
        }

        return res;
//        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
