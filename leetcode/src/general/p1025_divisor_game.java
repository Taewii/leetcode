package general;

public class p1025_divisor_game {
    public static void main(String[] args) {
        System.out.println(divisorGame(2));
        System.out.println(divisorGame(3));
    }


//   1. if Alice will lose for N, then Alice will must win for N+1, since Alice can first just make N decrease 1.
//   2. for any odd number N, it only has odd factor, so after the first move, it will be an even number
//    static boolean divisorGame(int N) {
//       return N % 2 == 0;
//    }

    // dp
    static boolean divisorGame(int N) {
        boolean[] dp = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    if (!dp[i - j]) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }

        return dp[N];
    }
}
