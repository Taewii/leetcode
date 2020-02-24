package strings;

import java.util.HashMap;
import java.util.Map;

public class p833_find_and_replace_in_string {
    public static void main(String[] args) {
        System.out.println(findReplaceString(
                "abcd",
                new int[]{0, 2},
                new String[]{"a", "cd"},
                new String[]{"eee", "ffff"}));

        System.out.println(findReplaceString(
                "abcd",
                new int[]{0, 2},
                new String[]{"ab", "ec"},
                new String[]{"eee", "ffff"}));

        System.out.println(findReplaceString(
                "wreorttvosuidhrxvmvo",
                new int[]{14, 12, 10, 5, 0, 18},
                new String[]{"rxv", "dh", "ui", "ttv", "wreor", "vo"},
                new String[]{"frs", "c", "ql", "qpir", "gwbeve", "n"}));
        // "gwbeveqpirosqlcfrsmn"
    }

    static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        Map<Integer, String> sourceMap = new HashMap<>();
        Map<Integer, String> targetMap = new HashMap<>();

        for (int i = 0; i < indexes.length; i++) {
            sourceMap.put(indexes[i], sources[i]);
            targetMap.put(indexes[i], targets[i]);
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < S.length()) {
            if (sourceMap.containsKey(i) && S.startsWith(sourceMap.get(i), i)) {
                sb.append(targetMap.get(i));
                i = i + sourceMap.get(i).length();
            } else {
                sb.append(S.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }
}
