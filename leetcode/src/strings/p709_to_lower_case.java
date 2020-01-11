package strings;

public class p709_to_lower_case {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("here"));
        System.out.println(toLowerCase("LOVELY"));
        System.out.println(toLowerCase("al&phaBET"));
    }

    static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 91 && chars[i] > 64) {
                chars[i] = (char) (chars[i] + 32);
            }
        }

        return String.valueOf(chars);
    }
}
