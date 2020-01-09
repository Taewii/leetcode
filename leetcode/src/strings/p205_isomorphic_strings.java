package strings;

import java.util.HashMap;
import java.util.Map;

public class p205_isomorphic_strings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }

    static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapA = new HashMap<>();
        Map<Character, Character> mapB = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charA = s.charAt(i);
            char charB = t.charAt(i);

            if (mapB.containsKey(charA)) {
                if (mapB.get(charA) != charB) return false;
            } else {
                mapB.put(charA, charB);
            }

            if (mapA.containsKey(charB)) {
                if (mapA.get(charB) != charA) return false;
            } else {
                mapA.put(charB, charA);
            }
        }

        return true;
    }
}
