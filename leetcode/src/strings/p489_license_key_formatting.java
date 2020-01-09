package strings;

public class p489_license_key_formatting {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(licenseKeyFormatting("2-5g-3-J", 1));
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
        System.out.println(licenseKeyFormatting("2-5g-3-J", 3));
        System.out.println(licenseKeyFormatting("2-5g-3-J", 4));
        System.out.println(licenseKeyFormatting("2-5g-3-J", 5));
    }

    static String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        char[] s = S.toCharArray();

        for (int i = s.length - 1, len = 0; i >= 0; i--) {
            if (s[i] != '-') {
                if (len > 0 && len % K == 0) {
                    sb.append('-');
                }
                sb.append(Character.toUpperCase(s[i]));
                len++;
            }
        }

        return sb.reverse().toString();
    }

    // super slow, but short and easy
//    static String licenseKeyFormatting(String S, int K) {
//        StringBuilder sb = new StringBuilder(S.replaceAll("-", "").toUpperCase());
//        for (int i = sb.length() - K; i > 0; i -= K) sb.insert(i, "-");
//        return sb.toString();
//    }
}
