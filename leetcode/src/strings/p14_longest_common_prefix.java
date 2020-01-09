package strings;

public class p14_longest_common_prefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flow", "flower", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"aa", "a"}));
    }

    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prev = strs[0];

        for (int i = 1; i < strs.length; ++i) {
            while (strs[i].indexOf(prev) != 0) {
                prev = prev.substring(0, prev.length() - 1);
            }
        }

        return prev;
    }
}
