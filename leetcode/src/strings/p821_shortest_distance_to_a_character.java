package strings;

import java.util.Arrays;

public class p821_shortest_distance_to_a_character {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
        System.out.println(Arrays.toString(shortestToChar("baaa", 'b')));
    }

    // 1ms
    static int[] shortestToChar(String S, char C) {
        char[] chars = S.toCharArray();
        int[] ans = new int[chars.length];
        int prev = -20000;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == C) prev = i;
            ans[i] = i - prev;
        }

        prev = 20000;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == C) prev = i;
            ans[i] = Math.min(prev - i, ans[i]);
        }

        return ans;
    }

    // 5ms
//    static int[] shortestToChar(String S, char C) {
//        char[] chars = S.toCharArray();
//        int[] ans = new int[chars.length];
//        List<Integer> indices = new ArrayList<>();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == C) indices.add(i);
//        }
//
//        for (int i = 0; i < chars.length; ++i) {
//            int min = Integer.MAX_VALUE;
//            for (Integer index : indices) {
//                min = Math.min(Math.abs(i - index), min);
//            }
//
//            ans[i] = min;
//        }
//
//        return ans;
//    }

    // 2 ms
//    static int[] shortestToChar(String S, char C) {
//        char[] chars = S.toCharArray();
//        int[] ans = new int[chars.length];
//        for (int i = 0; i < chars.length; ++i) {
//            int j = i;
//            int k = i;
//            while (chars[j] != C && chars[k] != C) {
//                if (k < chars.length - 1) k++;
//                if (j > 0) j--;
//                if (j == 0 && i == chars.length - 1) break;
//            }
//
//            ans[i] = Math.min(chars[j] == C ? Math.abs(i - j) : Integer.MAX_VALUE, chars[k] == C ? Math.abs(i - k) : Integer.MAX_VALUE);
//        }
//
//        return ans;
//    }
}
