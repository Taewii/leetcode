package strings;

import java.util.*;

public class p500_keyboard_row {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
        System.out.println(Arrays.toString(findWords(new String[]{"Aasdfghjkl", "Qwertyuiop", "zZxcvbnm"})));
        System.out.println(Arrays.toString(findWords(new String[]{})));
    }

    static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : row1.toCharArray()) map.put(c, 1);
        for (char c : row2.toCharArray()) map.put(c, 2);
        for (char c : row3.toCharArray()) map.put(c, 3);

        List<String> ans = new ArrayList<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                boolean isValid = true;
                char[] chars = word.toCharArray();
                int first = map.get(Character.toLowerCase(chars[0]));
                for (int i = 1; i < chars.length; i++) {
                    if (map.get(Character.toLowerCase(chars[i])) != first) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) ans.add(word);
            }
        }

        return ans.toArray(new String[ans.size()]);
    }
}
