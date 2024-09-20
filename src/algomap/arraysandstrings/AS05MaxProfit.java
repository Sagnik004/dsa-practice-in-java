package algomap.arraysandstrings;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class AS05MaxProfit {
    public static void main(String[] args) {
        maxProfit(new int[] {7,1,5,3,6,4});
        maxProfit(new int[] {7,6,4,3,1});
    }

    public static int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;

        int buy = 0, sell = 1;
        int maxProfit = 0;

        while (sell < prices.length) {
            if (prices[buy] > prices[sell]) {
                buy = sell;
            } else {
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, profit);
            }
            sell++;
        }

        System.out.println(maxProfit);
        return maxProfit;
    }
}
