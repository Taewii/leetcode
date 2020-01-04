public class p443_string_compression {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'})); // 6
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'})); // 6
        System.out.println(compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'})); // 4
        System.out.println(compress(new char[]{'a'})); // 1
    }

    static int compress(char[] chars) {
        if (chars.length == 0) return 0;

        int idx = 0;
        int fastPointer = 0;
        int slowPointer = 0;
        int count = 0;

        while (fastPointer < chars.length) {
            while (fastPointer < chars.length && chars[slowPointer] == chars[fastPointer]) {
                fastPointer++;
                count++;
            }

            chars[idx] = chars[slowPointer];
            if (count > 1) {
                char[] num = String.valueOf(count).toCharArray();
                for (char c : num) chars[++idx] = c;
            }

            if (fastPointer < chars.length) {
                count = 0;
                slowPointer = fastPointer;
                idx++;
            }
        }

        return idx + 1;
    }

    //                while (count > 0) {
//                    int digit = (int) (Math.pow(10, (int) (Math.log10(count))));
//                    chars[++firstIndex] = (char) (count / digit + '0');
//                    count %= digit;
//
//                    while (digit % 10 == 0 && digit >= 10) {
//                        if (count == 0) chars[++firstIndex] = '0';
//                        digit /= 10;
//                        if (count > 0 && digit % 10 == 0) break;
//                    }
//                }
}
