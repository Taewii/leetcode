package general;

public class p441_arranging_coins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
    }

    // iteration - 8ms - O(n)
    static int arrangeCoins(int n) {
        int step = 0;
        while (n > step) n -= ++step;
        return step;
    }

    // binary search - 1ms - O(logN)
//    static public int arrangeCoins(int n) {
//        int start = 1;
//        int end = n;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            long num = mid * (mid + 1L) / 2;
//            if (num == n) {
//                return mid;
//            } else if (num < n) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//
//        return end;
//    }

    // formula - 1ms - O(1)
//    static int arrangeCoins(int n) {
//        long tmp = 8L * n;
//        return (int) (Math.sqrt(tmp + 1) - 1) / 2;
//    }
}
