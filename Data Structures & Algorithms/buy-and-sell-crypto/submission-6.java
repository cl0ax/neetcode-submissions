class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; 
        int max_profit = 0; 

        for(int right = 0; right < prices.length; right++) {

            curr_profit = prices[right] - prices[left];

            if( curr_profit > max_profit ) {
                left = right; 
                max_profit = curr_profit; 
            }
        }
        return max_profit; 
    }
}
