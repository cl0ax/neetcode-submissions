class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if( nums.length <= 0 ) {
            return 0; 
        }

        int count = 0; 
        int left = 0; 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < k){
                count++; 
            }
        }

        int product = 1;
        for(int right = 0; right < nums.length; right++){
            product *= nums[right];
            if( product < k ){
                count += left + (right - left);
            }
            else{
                product /= nums[left];
                left++; 
            }
        }
        return count; 
    }
}