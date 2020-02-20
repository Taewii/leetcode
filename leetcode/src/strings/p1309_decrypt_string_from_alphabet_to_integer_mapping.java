package strings;

public class p1309_decrypt_string_from_alphabet_to_integer_mapping {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets("1326#"));
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }

    static String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int letter = Integer.parseInt(s.substring(i, i + 2));
                ans.append((char) (letter + 96));
                i += 2;
            } else {
                ans.append((char) (s.charAt(i) + 48));
            }
        }

        return ans.toString();
    }
}
