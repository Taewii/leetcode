public class p389_find_the_difference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference("heloworld", "helloworld"));
        System.out.println(findTheDifference("", "a"));
    }

    static char findTheDifference(String s, String t) {
        int[] list = new int[26];
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        for (int i = 0; i < t.length(); i++) {
            list[tc[i] - 'a']++;
            if (i < sc.length) list[sc[i] - 'a']--;
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] == 1) return (char) (i + 'a');
        }

        return '#';
    }

//    static char findTheDifference(String s, String t) {
//        char[] sca = s.toCharArray();
//        char[] tca = t.toCharArray();
//
//        char c = tca[sca.length];
//        for (int i = 0; i < sca.length; i++) {
//            c -= sca[i];
//            c += tca[i];
//        }
//        return c;
//    }
}
