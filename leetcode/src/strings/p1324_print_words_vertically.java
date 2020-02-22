package strings;

import java.util.ArrayList;
import java.util.List;

public class p1324_print_words_vertically {
    public static void main(String[] args) {
        System.out.println(printVertically("HOW ARE YOU"));
        System.out.println(printVertically("TO BE OR NOT TO BE"));
        System.out.println(printVertically("CONTEST IS COMING"));
    }

    static List<String> printVertically(String s) {
        String[] words = s.split(" ");
        List<String> ans = new ArrayList<>();

        for (int i = 0, maxLen = 1; i < maxLen; i++) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                int len = word.length();
                maxLen = Math.max(maxLen, len);
                sb.append(i >= len ? " " : word.charAt(i));
            }

            ans.add(sb.toString().stripTrailing());
        }

        return ans;
    }
}
