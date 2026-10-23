class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int max_profit = 0;
        int curr_profit = 0;
        

        while ( left < prices.length ) {
            for (int right = left + 1; right < prices.length; right++) {
                curr_profit = prices[right] - prices[left];
                max_profit = Math.max(curr_profit, max_profit);
            }
            left++; 
        }
        return max_profit;
    }
}
