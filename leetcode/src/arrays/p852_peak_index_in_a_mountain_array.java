package arrays;

public class p852_peak_index_in_a_mountain_array {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0, 1, 0}));
        System.out.println(peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
        System.out.println(peakIndexInMountainArray(new int[]{1, 2, 3, 4}));
    }

    static int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i + 1 < A.length; i++) {
            if (A[i] > A[i + 1]) return i;
        }

        return 0;
    }
}
