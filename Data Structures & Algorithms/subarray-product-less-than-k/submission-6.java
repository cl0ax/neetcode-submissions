class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int count = 0; 


        while( left < right ) {
            int sum = 0; 

            for(int i = 0; i < nums.length; i++ ) {
                sum += nums[left] + nums[i] + nums[right]; 

                if( sum < k ) {
                    count++; 
                }
                else if( sum < k ){
                    i++; 
                }
                else{
                    right--; 
                }
            }
        }
        return count; 
    }
}