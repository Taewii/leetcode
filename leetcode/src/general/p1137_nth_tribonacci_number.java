package general;

public class p1137_nth_tribonacci_number {
    public static void main(String[] args) {
        System.out.println(tribonacci(3));
        System.out.println(tribonacci(25));
    }

    static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n < 3) return 1;

        int a = 0;
        int b = 1;
        int c = 1;
        int total = 0;

        for (int i = 3; i <= n; i++) {
            total = a + b + c;
            a = b;
            b = c;
            c = total;
        }

        return total;
    }
}
