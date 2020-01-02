public class p278_first_bad_version {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(123456789));
    }

    static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static boolean isBadVersion(int verison) {
        return verison >= 12;
    }
}
