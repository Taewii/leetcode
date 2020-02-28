package strings;

public class p151_reverse_words_in_a_string {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world!  "));
    }

    static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int last = s.length() - 1;

        while (last >= 0) {
            if (s.charAt(last) == ' ') {
                --last;
                continue;
            }

            int beginning = s.lastIndexOf(' ', last);
            sb.append(s, beginning + 1, last + 1).append(" ");
            last = beginning - 1;
        }

        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
}
