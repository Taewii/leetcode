public class p541_reverse_string_2 {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 3));
    }

    static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i += k * 2) {
            reverseString(chars, i, Math.min(i + k - 1, chars.length - 1));
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
