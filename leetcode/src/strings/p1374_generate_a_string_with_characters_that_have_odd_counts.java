package strings;

public class p1374_generate_a_string_with_characters_that_have_odd_counts {
    public static void main(String[] args) {
        System.out.println(generateTheString(4));
        System.out.println(generateTheString(7));
        System.out.println(generateTheString(53));
        System.out.println(generateTheString(54));
    }

    static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n % 2 != 0 ? 'a' : 'b');
        while (n-- > 1) sb.append('a');
        return sb.toString();
    }
}
