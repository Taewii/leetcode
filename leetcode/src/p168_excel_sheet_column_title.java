public class p168_excel_sheet_column_title {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(26));
        System.out.println(convertToTitle(27));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(123456));
    }

    static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--;
            int cur = n % 26;
            char c = (char) ('A' + cur);
            sb.insert(0, c);
            n /= 26;
        }

        return sb.toString();
    }
}
