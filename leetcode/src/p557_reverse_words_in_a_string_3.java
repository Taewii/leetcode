public class p557_reverse_words_in_a_string_3 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("hello"));
        System.out.println(reverseWords(""));
    }

    static String reverseWords(String s) {
        if (s == null || s.length() == 0) return s;
        int start = 0;
        int end = 0;

        char[] chars = s.toCharArray();
        while (end < chars.length) {
            while (end < chars.length && chars[end] != ' ') end++;
            reverseString(chars, start, end - 1);
            start = ++end;
        }

        return String.valueOf(chars);
    }

    static void reverseString(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
