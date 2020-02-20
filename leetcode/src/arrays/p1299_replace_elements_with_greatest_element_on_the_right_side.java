package arrays;

import java.util.Arrays;

public class p1299_replace_elements_with_greatest_element_on_the_right_side {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
    }

    static int[] replaceElements(int[] arr) {
        int max = -1;
        int temp = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }

        return arr;
    }
}
