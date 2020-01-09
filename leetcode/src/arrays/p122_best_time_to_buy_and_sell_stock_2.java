package arrays;

public class p122_best_time_to_buy_and_sell_stock_2 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    // dp
    static int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;
        int[] bought = new int[n];
        int[] sold = new int[n];

        bought[0] = -prices[0];
        sold[0] = 0;

        for (int i = 1; i < n; i++) {
            bought[i] = Math.max(sold[i - 1] - prices[i], bought[i - 1]);
            sold[i] = Math.max(bought[i - 1] + prices[i], sold[i - 1]);
        }

        return sold[n - 1];
    }

//    static int maxProfit(int[] prices) {
//        int maxprofit = 0;
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] > prices[i - 1]) {
//                maxprofit += prices[i] - prices[i - 1];
//            }
//        }
//        return maxprofit;
//    }
}
