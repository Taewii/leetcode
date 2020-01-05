import java.util.Arrays;

public class p492_construct_the_rectangle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(4)));
        System.out.println(Arrays.toString(constructRectangle(123458)));
    }

    static int[] constructRectangle(int area) {
        int temp = (int) Math.sqrt(area);
        while (area % temp != 0) temp--;
        return new int[]{area / temp, temp};
    }
}
