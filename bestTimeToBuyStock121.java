class Solution {
  public int maxProfit(int[] prices) {
    int minBuy = Integer.MAX_VALUE;
    int profitIfSoldToday = 0;
    int profit = 0;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minBuy)
        minBuy = prices[i];
      profitIfSoldToday = prices[i] - minBuy;
      if (profitIfSoldToday > profit) {
        profit = profitIfSoldToday;
      }
    }
    return profit;
  }
}