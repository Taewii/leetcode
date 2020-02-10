package strings;

public class p1221_split_a_string_in_balanced_strings {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }

    static int balancedStringSplit(String s) {
        int ans = 0;
        int balance = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'L') balance++;
            else balance--;
            if (balance == 0) ans++;
        }

        return ans;
    }
}
