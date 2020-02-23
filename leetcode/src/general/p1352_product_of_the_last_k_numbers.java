package general;

import java.util.ArrayList;
import java.util.List;

public class p1352_product_of_the_last_k_numbers {
    public static void main(String[] args) {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(5);
        productOfNumbers.add(4);
        System.out.println(productOfNumbers.getProduct(2));
        System.out.println(productOfNumbers.getProduct(3));
        System.out.println(productOfNumbers.getProduct(4));
        productOfNumbers.add(8);
        System.out.println(productOfNumbers.getProduct(2));
    }

    private static class ProductOfNumbers {

        private List<Integer> prod;
        private int p;

        public ProductOfNumbers() {
            this.prod = new ArrayList<>();
            this.p = 1;
        }

        public void add(int num) {
            if (num == 0) {
                prod = new ArrayList<>();
                p = 1;
                return;
            }
            p *= num;
            prod.add(p);
        }

        public int getProduct(int k) {
            if (prod.size() < k) return 0;
            int ans = prod.get(prod.size() - 1);
            if (prod.size() == k) return ans;
            return (ans / prod.get(prod.size() - 1 - k));
        }
    }
}
