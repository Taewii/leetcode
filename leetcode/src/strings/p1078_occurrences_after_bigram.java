package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p1078_occurrences_after_bigram {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOcurrences("alice is a good girl she is a good student", "a", "good")));
        System.out.println(Arrays.toString(findOcurrences("we will we will rock you", "we", "will")));
    }

    static String[] findOcurrences(String text, String first, String second) {
        String[] strs = text.split(" ");

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < strs.length - 2; i++) {
            if (strs[i].equals(first) && strs[i + 1].equals(second)) {
                ans.add(strs[i + 2]);
            }
        }

        return ans.toArray(new String[ans.size()]);
    }
}
