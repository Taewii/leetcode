package strings;

import java.util.List;

public class p139_word_break {
    public static void main(String[] args) {
        System.out.println(wordBreak("leetcode", List.of("leet", "code")));
        System.out.println(wordBreak("applepenapple", List.of("apple", "pen")));
        System.out.println(wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }

    static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 0; i < n; i++) {
            if (!dp[i]) continue;
            for (String w : wordDict) {
                if (s.startsWith(w, i)) {
                    dp[i + w.length()] = true;
                }
            }
        }

        return dp[n];
    }
}
