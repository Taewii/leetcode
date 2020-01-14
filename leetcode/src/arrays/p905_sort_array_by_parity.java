package arrays;

import java.util.Arrays;

public class p905_sort_array_by_parity {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 1, 2, 4})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0, 2})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{2, 1})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0})));
    }

    static int[] sortArrayByParity(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] % 2 > arr[j] % 2) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }

            if (arr[i] % 2 == 0) i++;
            if (arr[j] % 2 == 1) j--;
        }

        return arr;
    }
}
