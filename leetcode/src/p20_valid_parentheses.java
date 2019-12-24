import java.util.ArrayDeque;
import java.util.Deque;

public class p20_valid_parentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(("));
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("["));
        System.out.println(isValid("([]"));
    }

    static boolean isValid(String s) {
        if (s.length() == 0) return true;
        if (s.length() == 1) return false;

        Deque<Character> stack = new ArrayDeque<>();
        char[] ch = s.toCharArray();
        String p = "([{)]}";

        if (p.indexOf(ch[0]) > 2) return false;
        if (p.indexOf(ch[ch.length - 1]) < 3) return false;

        for (char c : ch) {
            if (p.indexOf(c) < 3) {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty() || p.indexOf(c) - 3 != p.indexOf(stack.pop())) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
