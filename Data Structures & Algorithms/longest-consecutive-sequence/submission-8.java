class Solution {
    public int longestConsecutive(int[] nums) {
    

        if( nums.length == 0 ) {
            return 0;
        }

        Arrays.sort(nums);
        int length = 1;
        int curr = 1;

        for( int idx = 1; idx < nums.length; idx++ ) {
            if( nums[idx] == nums[idx - 1]  ) {
                continue;  
            }
            else if( nums[idx] == nums[idx - 1] + 1 ) {
                curr++; 
            }
            else{
                curr = 1;
                length = Math.max(length, curr);
            }
           
        }
        return length; 
    }
}
