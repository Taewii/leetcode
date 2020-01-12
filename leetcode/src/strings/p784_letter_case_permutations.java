package strings;

import java.util.ArrayList;
import java.util.List;

public class p784_letter_case_permutations {
    public static void main(String[] args) {
        List<String> res = letterCasePermutation("a1b2");
        List<String> res1 = letterCasePermutation("3z4");
        List<String> res2 = letterCasePermutation("12345");
    }

    static List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        dfs(S.toCharArray(), ans, 0);
        return ans;
    }

    private static void dfs(char[] chars, List<String> ans, int pos) {
        if (pos == chars.length) {
            ans.add(String.valueOf(chars));
            return;
        }

        if (Character.isDigit(chars[pos])) {
            dfs(chars, ans, pos + 1);
            return;
        }

        chars[pos] = Character.toLowerCase(chars[pos]);
        dfs(chars, ans, pos + 1);
        chars[pos] = Character.toUpperCase(chars[pos]);
        dfs(chars, ans, pos + 1);
    }
}
