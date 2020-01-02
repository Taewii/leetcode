public class p383_ransom_note {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
        System.out.println(canConstruct("aaa", "abb"));
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) return false;
        char[] r = ransomNote.toCharArray();

        int[] list = new int[26];
        int idx = 0;
        for (char c : r) {
            idx = magazine.indexOf(c, list[c - 'a']);
            if (idx < 0) return false;
            list[c - 'a'] = idx + 1;
        }

        return true;
    }
}
