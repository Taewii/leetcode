package strings;

import java.util.HashSet;
import java.util.Set;

public class p859_buddy_string {
    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ba"));
        System.out.println(buddyStrings("ab", "ab"));
        System.out.println(buddyStrings("aa", "aa"));
        System.out.println(buddyStrings("aaaaaaabc", "aaaaaaacb"));
        System.out.println(buddyStrings("", "aa"));
        System.out.println(buddyStrings("abc", "cda"));
    }

    static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        if (A.equals(B)) {
            Set<Character> s = new HashSet<>();
            for (char c : a) s.add(c);
            return s.size() < b.length;
        }

        int[] dif = new int[2];
        for (int i = 0, j = 0; i < a.length; ++i) {
            if (a[i] != b[i]) {
                if (j == 2) return false;
                dif[j++] = i;
            }
        }

        return a[dif[0]] == b[dif[1]] && a[dif[1]] == b[dif[0]];
    }
}
