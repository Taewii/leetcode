package general;

public class p204_count_primes {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    static int countPrimes(int n) {
        boolean[] isComposite = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
                if (i < Math.sqrt(n)) {
                    for (int j = i * i; j < n; j += i) {
                        isComposite[j] = true;
                    }
                }
            }
        }

        return count;
    }
}
