package strings;

public class p520_detect_capital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("America"));
        System.out.println(detectCapitalUse("A"));
        System.out.println(detectCapitalUse("a"));
    }

    static boolean detectCapitalUse(String word) {
        if (word.length() == 0) return true;
        char[] chars = word.toCharArray();
        boolean isFirstCap = chars[0] < 96;
        boolean allAreCap = true;
        boolean allAreLow = true;

        for (int i = 1; i < chars.length; i++) {
            if (!isFirstCap && chars[i] < 96) return false;
            if (chars[i] < 96) allAreLow = false;
            if (chars[i] > 96) allAreCap = false;
        }

        if (isFirstCap && (allAreCap || allAreLow)) return true;
        return !isFirstCap && allAreLow;
    }

    // simpler solution
//    static boolean detectCapitalUse(String word) {
//        int count = 0;
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) < 96) {
//                count++;
//            }
//        }
//
//        return count == word.length() || count == 0 || count == 1 && word.charAt(0) < 96;
//    }
}
