class Solution {
    public int maxProfit(int[] prices) {

        int maxPrice = 0;
        int maxProfit = 0;

        for (int i = prices.length - 1; i >= 0; i--) {
            if (maxPrice < prices[i]) {
                maxPrice = prices[i];
            } else {
                int diff = maxPrice - prices[i];
                maxProfit = maxProfit > diff ? maxProfit : diff;
            }
        }
        
        return maxProfit;
    }
}