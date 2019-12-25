public class p58_length_of_last_word {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("HelloWorld"));
        System.out.println(lengthOfLastWord(""));
        System.out.println(lengthOfLastWord("a"));
        System.out.println(lengthOfLastWord("a "));
        System.out.println(lengthOfLastWord(" a "));
        System.out.println(lengthOfLastWord(" hello world "));
    }

    // kinda cheating
    static int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int lastSpace = s.lastIndexOf(' ');
        if (lastSpace == -1) return s.length();
        return s.substring(lastSpace + 1).length();
    }

    static int lengthOfLastWord2(String s) {
        int count = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) != ' ') count++;
            if (s.charAt(i) == ' ' && count != 0) break;
            i--;
        }
        return count;
    }
}
