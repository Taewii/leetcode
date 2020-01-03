public class p434_number_of_segments_in_a_string {
    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
        System.out.println(countSegments("    foo    bar "));
        System.out.println(countSegments("                "));
        System.out.println(countSegments("a"));
    }

    static int countSegments(String s) {
        int segments = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                segments++;
            }
        }

        return segments;
    }
}
