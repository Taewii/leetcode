package strings;

import java.util.Arrays;

public class p806_number_of_lines_to_write_string {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfLines(
                new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                "abcdefghijklmnopqrstuvwxyz")));

        System.out.println(Arrays.toString(numberOfLines(
                new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                "bbbcccdddaaa")));
    }

    static int[] numberOfLines(int[] widths, String S) {
        char[] chars = S.toCharArray();
        int length = 0;
        int lines = 1;
        for (char ch : chars) {
            int width = widths[ch - 'a'];
            if (length + width > 100) {
                length = width;
                lines++;
            } else {
                length += width;
            }
        }

        return new int[]{lines, length};
    }
}
