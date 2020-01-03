public class p392_is_subsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
//        System.out.println(isSubsequence("abc", ""));
//        System.out.println(isSubsequence("b", "c"));
//        System.out.println(isSubsequence("a", "a"));
    }

    static boolean isSubsequence(String s, String t) {
        if (s == null || t == null) return false;
        char[] chars = s.toCharArray();

        int j = 0;
        for (char c : chars) {
            int index = t.indexOf(c, j);
            if (index == -1) return false;
            j = index + 1;
        }

        return true;
    }

    // pointers
//    static boolean isSubsequence(String s, String t) {
//        if (s.length() > t.length()) return false;
//        if (s.isEmpty()) return true;
//        char[] sc = s.toCharArray();
//        char[] tc = t.toCharArray();
//
//        int si = 0;
//
//        for (int ti = 0; ti < tc.length && si < sc.length;) {
//            if (sc[si] == tc[ti]) si++;
//            ti++;
//        }
//
//        return si == sc.length;
//    }
}
