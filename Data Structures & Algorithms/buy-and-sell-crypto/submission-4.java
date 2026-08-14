class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; 
        int right = left + 1;
        int max_profit = 0;

        while(right < prices.length ){
            int curr_profit = prices[right] - prices[left];
            max_profit = Math.max(curr_profit, max_profit );
            if(prices[right] < prices[left]){
                left = right;
            }
            right++;
        }
        return max_profit;
    }
}
