package general;

public class p1281_subtract_the_product_and_sum_of_digits_of_an_integer {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
    }

    static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int last = n % 10;
            product *= last;
            sum += last;
            n /= 10;
        }

        return product - sum;
    }
}
