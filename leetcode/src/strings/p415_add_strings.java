package strings;

public class p415_add_strings {
    public static void main(String[] args) {
        System.out.println(addStrings("1", "99999"));
        System.out.println(addStrings("1", "1"));
        System.out.println(addStrings("1", "2"));
        System.out.println(addStrings("111111111111111", "22"));
        System.out.println(addStrings("22", "111111111111111"));
        System.out.println(addStrings("22", ""));
        System.out.println(addStrings("", "22"));
    }

    static String addStrings(String num1, String num2) {
        int carry = 0;
        int aI = num1.length() - 1;
        int bI = num2.length() - 1;

        StringBuilder sb = new StringBuilder();
        while (true) {
            int aNum = aI >= 0 ? num1.charAt(aI) - '0' : 0;
            int bNum = bI >= 0 ? num2.charAt(bI) - '0' : 0;

            int sum = aNum + bNum;
            if (carry > 0) {
                sum++;
                carry--;
            }

            if (sum >= 10) carry++;
            sb.append(sum % 10);
            if (aI <= 0 && bI <= 0) {
                if (carry > 0) sb.append(carry);
                break;
            }
            aI--;
            bI--;
        }

        return sb.reverse().toString();
    }

    // cleaner & slightly faster
//    static String addStrings(String num1, String num2) {
//        int carry = 0;
//        StringBuilder sbSum = new StringBuilder();
//        int index1 = num1.length() - 1;
//        int index2 = num2.length() - 1;
//        while (index1 >= 0 || index2 >= 0 || carry > 0) {
//            if (index1 >= 0) {
//                carry += num1.charAt(index1--) - '0';
//            }
//            if (index2 >= 0) {
//                carry += num2.charAt(index2--) - '0';
//            }
//            sbSum.append(carry % 10);
//            carry /= 10;
//        }
//        return sbSum.reverse().toString();
//    }
}
