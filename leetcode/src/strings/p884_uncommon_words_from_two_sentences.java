package strings;

import java.util.*;

public class p884_uncommon_words_from_two_sentences {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
        System.out.println(Arrays.toString(uncommonFromSentences("apple apple", "banana")));
    }

    static String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();

        // with split
//        for (String str : A.split(" ")) {
//            map.put(str, map.getOrDefault(str, 0) + 1);
//        }
//
//        for (String str : B.split(" ")) {
//            map.put(str, map.getOrDefault(str, 0) + 1);
//        }

        for (int i = 0, j = 0; i < A.length(); ) {
            while (i < A.length() && A.charAt(i) != ' ') i++;
            String word = A.substring(j, i);
            map.put(word, map.getOrDefault(word, 0) + 1);
            j = ++i;
        }

        for (int i = 0, j = 0; i < B.length(); ) {
            while (i < B.length() && B.charAt(i) != ' ') i++;
            String word = B.substring(j, i);
            map.put(word, map.getOrDefault(word, 0) + 1);
            j = ++i;
        }

        List<String> list = new ArrayList<>();
        map.forEach((k, v) -> {
            if (v == 1) list.add(k);
        });

        return list.toArray(new String[list.size()]);
    }
}
