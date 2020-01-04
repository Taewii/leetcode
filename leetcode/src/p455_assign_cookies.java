import java.util.Arrays;

public class p455_assign_cookies {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        System.out.println(findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }

    static int findContentChildren(int[] children, int[] cookies) {
        Arrays.sort(children);
        Arrays.sort(cookies);

        int satisfied = 0;
        for (int i = 0; satisfied < children.length && i < cookies.length; i++) {
            if (cookies[i] >= children[satisfied]) {
                satisfied++;
            }
        }

        return satisfied;
    }
}
