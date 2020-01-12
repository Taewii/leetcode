package strings;

public class p748_shortest_completing_word {
    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"}));
        System.out.println(shortestCompletingWord("1s3 456", new String[]{"looks", "pest", "stew", "show"}));
    }

    static String shortestCompletingWord(String licensePlate, String[] words) {
        int minLen = Integer.MAX_VALUE;
        int idx = -1;
        String str = normalizeLetters(licensePlate);

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < minLen && isGoodMatch(str, words[i])) {
                minLen = words[i].length();
                idx = i;
            }
        }
        return words[idx];
    }

    static String normalizeLetters(String s) {
        StringBuilder builder = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'z') builder.append(Character.toLowerCase(ch));
        }
        return builder.toString();
    }

    static boolean isGoodMatch(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] letters = new int[26];

        for (int i = 0; i < s2.length(); i++) {
            letters[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (letters[s1.charAt(i) - 'a'] == 0) return false;
            letters[s1.charAt(i) - 'a']--;
        }

        return true;
    }
}
