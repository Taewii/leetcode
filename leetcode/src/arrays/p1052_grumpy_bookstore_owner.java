package arrays;

public class p1052_grumpy_bookstore_owner {
    public static void main(String[] args) {
        System.out.println(maxSatisfied(
                new int[]{1, 0, 1, 2, 1, 1, 7, 5},
                new int[]{0, 1, 0, 1, 0, 1, 0, 1},
                3));
    }

    static int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int actual = 0;
        int possible = 0;

        for (int i = 0; i < X; i++) {
            if (grumpy[i] == 0) actual += customers[i];
            possible += customers[i];
        }

        int diff = possible - actual;
        for (int i = X; i < customers.length; i++) {
            if (grumpy[i - X] == 1) possible -= customers[i - X];
            if (grumpy[i] == 0) actual += customers[i];
            possible += customers[i];
            diff = Math.max(diff, possible - actual);
        }

        return actual + diff;
    }
}
