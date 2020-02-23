package arrays;

import java.util.Arrays;

public class p1338_reduce_array_size_to_the_half {
    public static void main(String[] args) {
        System.out.println(minSetSize(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7}));
        System.out.println(minSetSize(new int[]{7, 7, 7, 7, 7, 7}));
    }

    static int minSetSize(int[] arr) {
        int[] count = new int[100001];
        for (int num : arr) count[num]++;
        Arrays.sort(count);

        int sets = 0;
        int size = arr.length;
        int half = arr.length / 2;
        for (int i = count.length - 1; i >= 0; i--) {
            sets++;
            size -= count[i];
            if (size <= half) break;
        }

        return sets;
    }
}
