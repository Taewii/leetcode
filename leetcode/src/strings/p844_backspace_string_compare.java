package strings;

public class p844_backspace_string_compare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a##c", "#a#c"));
        System.out.println(backspaceCompare("abc###hello", "hello"));
    }

    static boolean backspaceCompare(String S, String T) {
        return convert(S).equals(convert(T));
    }

    private static String convert(String str) {
        char[] chars = str.toCharArray();

        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '#') {
                if (k > 0) k--;
            } else {
                chars[k++] = chars[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(chars[i]);
        }

        return sb.toString();
    }
}
