package arrays;

public class p1357_bulb_switcher_3 {
    public static void main(String[] args) {
        System.out.println(numTimesAllBlue(new int[]{2, 1, 3, 5, 4}));
//        System.out.println(numTimesAllBlue(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}));
    }

    static int numTimesAllBlue(int[] light) {
        int right = 0;
        int moments = 0;

        for (int i = 0; i < light.length; i++) {
            right = Math.max(right, light[i]);
            if (right == i + 1) moments++;
        }

        return moments;
    }
}
