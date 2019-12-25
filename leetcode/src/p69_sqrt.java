public class p69_sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }

    // newtons method
//    static int mySqrt(int x) {
//        if (x == 0) return 0;
//        long i = x;
//        while (i > x / i) {
//            i = (i + x / i) / 2;
//        }
//        return (int) i;
//    }

    // binary search
    static int mySqrt(int x) {
        if (x == 0) return 0;
        int start = 1;
        int end = x;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            } else if (mid > x / mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
