package strings;

import java.util.HashMap;
import java.util.Map;

public class p290_word_pattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(wordPattern("abba", "dog dog dog dog")); // false
        System.out.println(wordPattern("aaaa", "dog dog dog dog")); // true
        System.out.println(wordPattern("ab", "dog dog")); // false

    }

    static boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if (pattern.length() != strings.length) return false;
        Map<Character, String> byPattern = new HashMap<>();
        Map<String, Character> byString = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char ch = pattern.charAt(i);
            String strr = strings[i];

            if (byPattern.containsKey(ch)) {
                if (!byString.containsKey(strr)) return false;
                if (byString.get(strr) != ch) return false;
                if (!byPattern.get(ch).equals(strr)) return false;
            } else if (byString.containsKey(strr)) {
                if (!byPattern.containsKey(ch)) return false;
            } else {
                byPattern.put(ch, strr);
                byString.put(strr, ch);
            }
        }

        return true;
    }
}
