package strings;

public class p791_custom_sort_string {
    public static void main(String[] args) {
        System.out.println(customSortString("cba", "abcd"));
    }

    static String customSortString(String S, String T) {
        int[] count = new int[26];
        for (char ch : T.toCharArray()) count[ch - 'a']++;

        StringBuilder sb = new StringBuilder();
        for (char ch : S.toCharArray()) {
            while (count[ch - 'a']-- > 0) {
                sb.append(ch);
            }
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                sb.append((char) (i + 'a'));
            }
        }

        return sb.toString();
    }
}
