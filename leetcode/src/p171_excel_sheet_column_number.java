public class p171_excel_sheet_column_number {
    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
        System.out.println(titleToNumber("FZPH")); // 123456
    }

    static int titleToNumber(String s) {
        int ans = 0;

        for (int i = s.length() - 1, n = 0; i >= 0; i--, n++) {
            ans += (s.charAt(i) - '@') * Math.pow(26, n);
        }

        return ans;
    }
}
