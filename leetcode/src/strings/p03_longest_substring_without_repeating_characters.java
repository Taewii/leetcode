package strings;

public class p03_longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("!@#$%^@@!@"));
    }

    static int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();

        int[] seen = new int[128];
        int max = 0;
        int left = 0;

        for (int i = 0; i < str.length; i++) {
            if (seen[str[i]] <= left) {
                seen[str[i]] = i + 1;
                max = Math.max(i - left + 1, max);
            } else {
                left = seen[str[i]];
                seen[str[i]] = i + 1;
            }
        }

        return max;
    }

//    static int lengthOfLongestSubstring(String s) {
//        char[] str = s.toCharArray();
//
//        Set<Character> set = new HashSet<>();
//        int max = 0;
//
//        for (int i = 0, j = 0; i < str.length && j < str.length; ) {
//            if (!set.contains(str[i])) {
//                set.add(str[i++]);
//                max = Math.max(max, i - j);
//            } else {
//                set.remove(str[j++]);
//            }
//        }
//
//        return max;
//    }
}
