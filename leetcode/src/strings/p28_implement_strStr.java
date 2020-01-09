package strings;

public class p28_implement_strStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
        System.out.println(strStr("mississippi", "pi"));
    }

    // its kinda cheating for using substring tho
    static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.equals(needle)) return 0;
        if (needle.length() > haystack.length()) return -1;

        int n = needle.length();

        for (int i = 0; i <= haystack.length() - n; i++) {
            if (needle.equals(haystack.substring(i, i + n))) {
                return i;
            }
        }

        return -1;
    }
}
