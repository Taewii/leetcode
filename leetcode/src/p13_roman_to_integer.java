public class p13_roman_to_integer {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    // @formatter:off
    static int romanToInt(String s) {
        char[] ch = s.toCharArray();
        int ans = 0;

        for (int i = 0; i < ch.length; i++) {
            char next = ch[Math.min(ch.length - 1, i + 1)];

            switch (ch[i]) {
                case 'I':
                    if (next == 'V') { ans += 4; i++; } else if (next == 'X') { ans += 9; i++; } else ans++;
                    break;
                case 'X':
                    if (next == 'L') { ans += 40; i++; } else if (next == 'C') { ans += 90; i++; } else ans += 10;
                    break;
                case 'C': if (next == 'D') { ans += 400; i++; } else if (next == 'M') { ans += 900; i++; } else ans += 100;
                    break;
                case 'V': ans += 5; break;
                case 'L': ans += 50; break;
                case 'D': ans += 500; break;
                case 'M': ans += 1000; break;
            }
        }

        return ans;
    }
    // @formatter:on
}
