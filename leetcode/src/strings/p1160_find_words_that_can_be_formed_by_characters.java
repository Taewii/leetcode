package strings;

import java.util.Arrays;

public class p1160_find_words_that_can_be_formed_by_characters {
    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));
        System.out.println(countCharacters(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr"));
    }

    static int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        for (char ch : chars.toCharArray()) count[ch - 'a']++;

        int total = 0;
        for (String word : words) {
            boolean found = true;
            int[] seen = Arrays.copyOf(count, count.length);

            for (char ch : word.toCharArray()) {
                if (seen[ch - 'a']-- < 1) {
                    found = false;
                    break;
                }
            }

            if (found) {
                total += word.length();
            }
        }

        return total;
    }
}
