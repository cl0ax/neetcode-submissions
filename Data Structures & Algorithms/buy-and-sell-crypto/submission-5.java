class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = left + 1;
        int n = prices.length;
        int maxP = 0;

        while( right < n ){
            int currP = prices[right] - prices[left]; 
            maxP = Math.max(maxP, currP);
            if(prices[left] > prices[right]){
                left = right;
            }
            else{
                right++;
            }


        }
        return maxP;
    }
}
