package general;

public class p509_fibonacci_number {
    public static void main(String[] args) {
//        System.out.println(fib(2));
//        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(20));
    }

    static int fib(int N) {
        if (N < 2) return N;
        int prevPrev;
        int prev = 0;
        int cur = 1;

        for (int i = 1; i < N; i++) {
            prevPrev = prev;
            prev = cur;
            cur = prevPrev + prev;
        }

        return cur;
    }

    // recursive
//    static int fib(int N) {
//       if (N < 2) return N;
//       return fib(N - 1) + fib(N - 2);
//    }
}
