class Solution {
    public int longestOnes(int[] nums, int k) {
        int ones = 0;
        int left = 0;
        int maxC = 0;
        for(int right = 0; right < nums.length; right++){
            if( nums[right] == 1 ){
                ones++;
            }
            while( (right - left + 1) - ones > k){
                if(nums[left] == 1){
                    ones--;
                }
                left++;
            }
            maxC = Math.max(maxC, (right - left + 1));
        }
        return maxC;
    }
}