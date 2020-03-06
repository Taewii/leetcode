package strings;

import java.util.ArrayList;
import java.util.List;

public class p131_palindrome_partitioning {
    public static void main(String[] args) {
        partition("aab").forEach(System.out::println);
    }

    static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        part(ans, new ArrayList<>(), s, 0);
        return ans;
    }

    private static void part(List<List<String>> ans, List<String> parts, String s, int start) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(parts));
        } else {
            for (int i = start; i < s.length(); i++) {
                if (isPalindrome(s, start, i)) {
                    parts.add(s.substring(start, i + 1));
                    part(ans, parts, s, i + 1);
                    parts.remove(parts.size() - 1);
                }
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }

        return true;
    }
}
