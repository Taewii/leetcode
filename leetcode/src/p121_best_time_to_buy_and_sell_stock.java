public class p121_best_time_to_buy_and_sell_stock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    // O(n)
    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    // O(n^2)
//    static int maxProfit(int[] prices) {
//        int maxProfit = Integer.MIN_VALUE;
//
//        for (int i = 0; i < prices.length; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int j = i + 1; j < prices.length; j++) {
//                if (prices[j] > prices[i] && prices[j] > max) {
//                    max = prices[j];
//                }
//            }
//
//            if (max != Integer.MIN_VALUE && max - prices[i] > maxProfit) {
//                maxProfit = max - prices[i];
//            }
//        }
//
//        return maxProfit == Integer.MIN_VALUE ? 0 : maxProfit;
//    }
}
