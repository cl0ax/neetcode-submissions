class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; 
        int right = left + 1;
        int max_profit = 0;

        //Arrays.sort(prices);

        while( left < right && right < prices.length - 1 ){
            int curr_profit = prices[right] - prices[left];
            //the scanning ahead part
            int scan_ahead_profit = prices[right + 1] - prices[left];
            if( curr_profit < scan_ahead_profit ){
                right++;
                max_profit = curr_profit = prices[right] - prices[left];
            }
            else{
            left++;
            right++;
            }
        }
        return max_profit;
    }
}
