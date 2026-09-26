class Solution {
    public int longestConsecutive(int[] nums) {

        if( nums.length == 0 ){
            return 0; 
        }

        Arrays.sort(nums);

        int consecutive = 0;
        int left = 0; 

        for(int i = 1; i < nums.length; i++ ){
            if( nums[i] == nums[left] + 1 ) { // > than the past elem
                consecutive = (i - left); 
            }
            else if( nums[i] == nums[i - 1] + 1 ){
                consecutive = (i - left); 
            }
            else if( nums[i] == nums[i - 1] ) { // handles duplicate 
                continue; 
            }
        }
        return consecutive; 
    }
}
