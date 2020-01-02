public class p374_guess_the_number_higher_or_lower {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    static int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int guess = guess(mid);

            if (guess == 0) {
                return mid;
            } else if (guess == 1) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    static int guess(int num) {
        if (num == 6) return 0;
        return num > 6 ? -1 : 1;
    }
}
