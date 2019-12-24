public class p07_reverse_integer {
    public static void main(String[] args) {
        System.out.println(reverse(12333311));
    }

    public static int reverse(int x) {
        int ans = 0;

        while (x != 0) {
            try {
                ans = Math.addExact(Math.multiplyExact(ans, 10), x % 10);
            } catch (ArithmeticException e) {
                return 0;
            }
            x /= 10;
        }

        return ans;
    }
}
