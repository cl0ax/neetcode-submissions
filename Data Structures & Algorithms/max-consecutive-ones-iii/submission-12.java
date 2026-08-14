class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int l = 0;
        int ones = 0;
        int maxC = 0;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] == 1){
                ones++;
            }
            while( (r - l + 1 ) - ones > k){
                if(nums[l] == 1){
                    ones--;
                }
                l++;
            }
            maxC = Math.max(maxC, r - l + 1);
        }
       
        return maxC;

    }
}