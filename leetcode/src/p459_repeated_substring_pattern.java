public class p459_repeated_substring_pattern {
    public static void main(String[] args) {
//        System.out.println(repeatedSubstringPattern("abab"));
//        System.out.println(repeatedSubstringPattern("aba"));
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
    }

//    static boolean repeatedSubstringPattern(String s) {
//        for (int i = 1; i <= s.length() ; i++) {
//            String substring = s.substring(0, i);
//            if ((s.length() - i) % i != 0) continue;
//            StringBuilder sb = new StringBuilder();
//            for (int j = 0; j < s.length() / i; j++) {
//                sb.append(substring);
//            }
//
//            if (s.equals(sb.toString())) return true;
//        }
//
//        return false;
//    }

    static boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() < 2) return false;
        String pattern = "";
        int i = 0;
        for (i = s.length() / 2; i > 0; i--) {
            if (s.length() % i == 0) {
                pattern = s.substring(0, i);
                if (pattern.equals(s.substring(i, i + pattern.length()))) break;
            }
        }

        while (i < s.length()) {
            if (!pattern.equals(s.substring(i, i + pattern.length()))) return false;
            i += pattern.length();
        }

        return true;
    }
}
