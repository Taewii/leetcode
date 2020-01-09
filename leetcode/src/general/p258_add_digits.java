package general;

public class p258_add_digits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(2412));
        System.out.println(addDigits(443));
    }

    static int addDigits(int num) {
        return num <= 9 ? num : num % 9 == 0 ? 9 : num % 9;
    }

    // even shorter lmao
//    public int addDigits(int num) {
//        return (num - 1) % 9 + 1;
//    }

    // with loops
//    static int addDigits(int num) {
//        int sum = 0;
//
//        while (true) {
//            while (num != 0) {
//                sum += num % 10;
//                num /= 10;
//            }
//            num = sum;
//            if (sum < 10) break;
//            sum = 0;
//        }
//
//        return sum;
//    }
}
