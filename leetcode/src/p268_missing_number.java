public class p268_missing_number {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.println(missingNumber(new int[]{1, 2}));
        System.out.println(missingNumber(new int[]{0}));
    }

    static int missingNumber(int[] nums) {
        int expected = 0;
        int actual = 0;

        for (int i = 0; i < nums.length + 1; i++) {
            if (i >= nums.length) {
                expected += i;
                break;
            }

            actual += nums[i];
            expected += i;
        }

        return expected - actual;
    }
}
