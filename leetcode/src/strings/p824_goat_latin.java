package strings;

public class p824_goat_latin {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }

    static String toGoatLatin(String S) {
        int prevIdx = 0;
        int idx = 0;
        int wordCount = 0;

        StringBuilder sb = new StringBuilder();
        while (idx < S.length()) {
            while (idx < S.length() && S.charAt(idx) != ' ') idx++;
            wordCount++;

            char ch = S.charAt(prevIdx);
            if (!"AEIOUaeiou".contains(String.valueOf(ch))) {
                sb.append(S, prevIdx + 1, idx);
                sb.append(ch);
            } else {
                sb.append(S, prevIdx, idx);
            }

            sb.append("ma");
            for (int i = 0; i < wordCount; i++) {
                sb.append("a");
            }

            sb.append(" ");
            prevIdx = ++idx;
        }

        return sb.toString().trim();
    }
}
