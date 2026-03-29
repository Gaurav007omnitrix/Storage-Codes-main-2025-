public class D2BuySellStock {
    public static void main(String[] args) {
       int[] prices= {3, 7, 5, 1, 6, 4};

        D2BuySellStock obj = new D2BuySellStock();
        int result = obj.maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0) return 0;
            int buyPrice = prices[0];
            int profit = 0;

            for (int i = 1; i < prices.length; i++) {
                if (buyPrice > prices[i]) {
                    buyPrice = prices[i];
                }
                profit = Math.max(profit, prices[i] - buyPrice);
            }
            return profit;
        }
    }
