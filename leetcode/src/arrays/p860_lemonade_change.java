package arrays;

public class p860_lemonade_change {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5, 5, 5, 10, 20}));
        System.out.println(lemonadeChange(new int[]{5, 5, 10}));
        System.out.println(lemonadeChange(new int[]{5, 5, 10, 10, 20}));
        System.out.println(lemonadeChange(new int[]{10, 10}));
    }

    static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                five--;
                ten++;
            } else if (ten > 0) {
                ten--;
                five--;
            } else {
                five -= 3;
            }

            if (five < 0) return false;
        }

        return true;
    }
}
