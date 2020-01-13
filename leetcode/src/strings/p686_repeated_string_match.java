package strings;

public class p686_repeated_string_match {
    public static void main(String[] args) {
        System.out.println(repeatedStringMatch("abcd", "cdabcdab"));
    }

    static int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        int repetitions = 1;
        while (sb.length() < B.length()) {
            sb.append(A);
            repetitions++;
        }
        if (sb.indexOf(B) != -1) return repetitions;
        if (sb.append(A).indexOf(B) != -1) return repetitions + 1;
        return -1;
    }
}
