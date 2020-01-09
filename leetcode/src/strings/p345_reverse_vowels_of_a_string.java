package strings;

public class p345_reverse_vowels_of_a_string {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("elllllo"));
        System.out.println(reverseVowels("aeiou"));
        System.out.println(reverseVowels("ae"));
        System.out.println(reverseVowels("a"));
        System.out.println(reverseVowels(""));
        System.out.println(reverseVowels(".,"));
    }

    static String reverseVowels(String s) {
        boolean[] vowels = new boolean[128];
        vowels['a'] = true;
        vowels['e'] = true;
        vowels['i'] = true;
        vowels['o'] = true;
        vowels['u'] = true;

        vowels['A'] = true;
        vowels['E'] = true;
        vowels['I'] = true;
        vowels['O'] = true;
        vowels['U'] = true;

        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            while (start < end && !vowels[chars[start]]) start++;
            while (start < end && !vowels[(chars[end])]) end--;

            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }

        return String.valueOf(chars);
    }
}
