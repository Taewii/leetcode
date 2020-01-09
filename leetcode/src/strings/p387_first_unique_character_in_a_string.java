package strings;

public class p387_first_unique_character_in_a_string {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aaaa"));
        System.out.println(firstUniqChar("z"));
        System.out.println(firstUniqChar("aadadaad"));
    }

    static int firstUniqChar(String s) {
        boolean[] used = new boolean[26];
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (s.indexOf(ch, i + 1) == -1 && !used[ch - 'a']) {
                return i;
            }
            used[ch - 'a'] = true;
        }

        return -1;
    }
}
