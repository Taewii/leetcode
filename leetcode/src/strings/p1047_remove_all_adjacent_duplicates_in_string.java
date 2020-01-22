package strings;

public class p1047_remove_all_adjacent_duplicates_in_string {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("aaaa"));
    }

//    static String removeDuplicates(String str) {
//        char[] chars = str.toCharArray();
//        int n = chars.length;
//        char prev = chars[0];
//
//        for (int i = 1; i < n; i++) {
//            if (chars[i] == prev) {
//                if (i - 1 > 0) {
//                    str = str.substring(0, i - 1) + str.substring(i + 1);
//                } else {
//                    str = str.substring(i + 1);
//                }
//                chars = str.toCharArray();
//                n = chars.length;
//                if (n == 0) return "";
//                prev = chars[0];
//                i = 0;
//            } else {
//                prev = chars[i];
//            }
//        }
//
//        return str;
//    }

    static String removeDuplicates(String str) {
        char[] chars = str.toCharArray();
        int idx = -1;

        for (char c : chars) {
            if (idx >= 0 && chars[idx] == c) {
                idx--;
            } else {
                idx++;
                chars[idx] = c;
            }
        }

        return String.valueOf(chars, 0, idx + 1);
    }
}
