package general;

public class p12_integer_to_roman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
        System.out.println(intToRoman(3909));
    }


    // 4-5 ms
    static String intToRoman(int num) {
        int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] chars = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            int count = num / nums[i];
            for (int j = 0; j < count; j++) {
                sb.append(chars[i]);
            }
            num %= nums[i];
        }

        return sb.toString();
    }

    // 3-4 ms?
//    static String intToRoman(int num) {
//        int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        String[] chars = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//        StringBuilder res = new StringBuilder();
//
//        int pos = 0;
//        while (num > 0) {
//            if (num - nums[pos] >= 0) {
//                res.append(chars[pos]);
//                num = num - nums[pos];
//            } else {
//                pos++;
//            }
//        }
//
//        return res.toString();
//    }
}
