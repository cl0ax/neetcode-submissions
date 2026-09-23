class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int right = left + 1;
        int count = 0; 
        Arrays.sort(nums);

        for(int num : nums){
            if(num < k ){
                count++; 
            }
        }

        Set<Integer> window = new ArraySet<>(); 


        while( left < right ) {
            int product = nums[left] * nums[right]; 

            if( product > k ) {
                
            }
            

            // for(int i = left + 1; i < nums.length; i++ ) {
            //     sum += nums[left] * nums[i] * nums[right]; 

            //     if( sum < k ) {
            //         count++; 
            //     }
            //     else if( sum < k ){
            //         i++; 
            //     }
            //     else{
            //         right--; 
            //     }
            // }
        }
        return count; 
    }
}