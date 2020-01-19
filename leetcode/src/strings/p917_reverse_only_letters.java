package strings;

public class p917_reverse_only_letters {
    public static void main(String[] args) {
//        System.out.println(reverseOnlyLetters("ab-cd"));
//        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
//        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
        System.out.println(reverseOnlyLetters("---ab---cd---abcd--"));
    }

    static String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            while (start < end && !Character.isLetter(chars[start])) start++;
            while (end > start && !Character.isLetter(chars[end])) end--;
            char tmp = chars[end];
            chars[end--] = chars[start];
            chars[start++] = tmp;
        }

        return String.valueOf(chars);
    }
}
