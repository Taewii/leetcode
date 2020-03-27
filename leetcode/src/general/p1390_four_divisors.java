package general;

public class p1390_four_divisors {
    public static void main(String[] args) {
        System.out.println(sumFourDivisors(new int[]{21, 4, 7}));
    }

    static int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int divisors = 0;
            int sum = 0;

            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (divisors > 4) break;
                if (num % i == 0) {
                    sum += i;
                    if (num / i == i) {
                        divisors++;
                    } else {
                        sum += num / i;
                        divisors += 2;
                    }
                }
            }

            if (divisors == 4) ans += sum;
        }

        return ans;
    }
}
