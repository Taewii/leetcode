package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p820_short_encoding_of_words {
    public static void main(String[] args) {
        System.out.println(minimumLengthEncoding(new String[]{"time", "me", "bell"}));
    }

    static int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));

        for (String word : words) {
            for (int i = 1; i < word.length(); i++) {
                set.remove(word.substring(i));
            }
        }

        int ans = 0;
        for (String word : set) {
            ans += word.length() + 1;
        }

        return ans;
    }
}
