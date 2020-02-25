package arrays;

public class p845_longest_mountain_in_array {
    public static void main(String[] args) {
        System.out.println(longestMountain(new int[]{2, 1, 4, 7, 3, 2, 5}));
        System.out.println(longestMountain(new int[]{2, 2, 2}));
    }

//    static int longestMountain(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//
//        int prevLeft = -1;
//        int prevRight = 10001;
//        int bestLeft = left;
//        int bestRight = right;
//
//        while (left <= right) {
//            if (arr[left] <= prevLeft) {
//                bestLeft = left;
//            }
//
//            if (arr[right] <= prevRight) {
//                bestRight = right;
//            }
//
//            prevLeft = arr[left];
//            prevRight = arr[right];
//            left++;
//            right--;
//        }
//
//        return bestRight - bestLeft == 0 ? 0 : bestRight - bestLeft + 1;
//    }

    static int longestMountain(int[] A) {
        int n = A.length;
        if (n < 3) return 0;

        int left = 0;
        int right;
        int max = 0;

        while (left < n - 2) {
            while (left < n - 1 && A[left] >= A[left + 1]) {
                left++;
            }
            
            right = left + 1;
            while (right < n - 1 && A[right] < A[right + 1]) {
                right++;
            }

            while (right < n - 1 && A[right] > A[right + 1]) {
                right++;
                max = Math.max(max, right - left + 1);
            }

            left = right;
        }
        return max;
    }
}
