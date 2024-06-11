package Questions;

public class BuyAndSellStock {
    public static int buysellStocks(int[] prices) {

        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {// profit
                int profit = prices[i] - buyPrice;// today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }

        }
        return maxProfit;

    }

    public static void main(String[] args) {
        // test cases

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int prices1[] = { 7, 6, 4, 3, 1 };

        System.out.println(buysellStocks(prices));// Output: 5
        System.out.println(buysellStocks(prices1));//  Output: 0

    }
}
