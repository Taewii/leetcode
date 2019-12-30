import java.util.HashSet;
import java.util.Set;

public class p202_happy_number {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    static boolean isHappy(int n) {
        Set<Integer> nums = new HashSet<>();
        while (n != 1) {
            n = getNum(n);
            if (nums.contains(n)) return false;
            nums.add(n);
        }

        return true;
    }

    static int getNum(int n) {
        int num = 0;

        while (n != 0) {
            num += Math.pow(n % 10, 2);
            n /= 10;
        }

        return num;
    }
}
