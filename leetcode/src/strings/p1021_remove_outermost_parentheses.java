package strings;

public class p1021_remove_outermost_parentheses {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(removeOuterParentheses("()()"));
    }

    static String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        int close = 0;
        int start = 0;
        char[] chars = S.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') open++;
            else if (chars[i] == ')') close++;

            if (open == close) {
                sb.append(S, start + 1, i);
                start = i + 1;
            }
        }

        return sb.toString();
    }
}
