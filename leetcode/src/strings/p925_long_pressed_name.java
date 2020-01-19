package strings;

public class p925_long_pressed_name {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex", "aaleex"));
        System.out.println(isLongPressedName("saeed", "ssaaedd"));
        System.out.println(isLongPressedName("leelee", "lleeelee"));
        System.out.println(isLongPressedName("laiden", "laiden"));
        System.out.println(isLongPressedName("pyplrz", "ppyypllr"));
    }

    static boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) return false;
        char[] n = name.toCharArray();
        char[] t = typed.toCharArray();

        for (int i = 0, j = 0; i < n.length; i++, j++) {
            if (n[i] != t[j]) {
                char ch = t[j];
                while (j < t.length - 1 && t[j] == ch) j++;
                if (n[i] != t[j]) return false;
            }

            if (j == t.length - 1 && i < n.length - 1) return false;
        }

        return true;
    }
}
