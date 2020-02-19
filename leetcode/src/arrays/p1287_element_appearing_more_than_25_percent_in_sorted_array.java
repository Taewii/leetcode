package arrays;

public class p1287_element_appearing_more_than_25_percent_in_sorted_array {
    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
        System.out.println(findSpecialInteger(new int[]{1, 2, 3, 3}));
        System.out.println(findSpecialInteger(new int[]{9057, 13452, 13452, 13452, 13452, 13452, 14141, 14448, 60395, 95081}));
    }

    static int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int t = n / 4;

        for (int i = 0; i < n - t; i++) {
            if (arr[i] == arr[i + t]) {
                return arr[i];
            }
        }

        return -1;
    }
}
