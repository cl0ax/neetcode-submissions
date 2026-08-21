class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; 
        int right = prices.length - 1;
        int max_profit = 0;

        //Arrays.sort(prices);

        while( left < right ){
            int curr_profit = prices[right] - prices[left];
            max_profit = Math.max(max_profit, curr_profit );
            if(curr_profit < max_profit){
                left++;
            }
            else{
                right--;
            }

        }
        return max_profit;
    }
}
