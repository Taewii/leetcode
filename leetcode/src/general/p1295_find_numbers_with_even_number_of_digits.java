package general;

public class p1295_find_numbers_with_even_number_of_digits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896}));
        System.out.println(findNumbers(new int[]{555, 901, 482, 1771}));
    }

    // 1 ms
    static int findNumbers(int[] nums) {
        int even = 0;
        for (int num : nums) {
            if (countDigits(num) % 2 == 0) even++;
        }

        return even;
    }

    private static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    // 0 ms
//    static int findNumbers(int[] nums) {
//        int count = 0;
//        for (int num : nums) {
//            if ((int) (Math.log10(num) + 1) % 2 == 0) {
//                count++;
//            }
//        }
//
//        return count;
//    }
}
