class Solution {
    public int longestConsecutive(int[] nums) {

        if( nums.length == 0 ){
            return 0; 
        }

        Arrays.sort(nums);

        int consecutive = 1;
        int longest = 1; 

        for(int i = 1; i < nums.length; i++ ){
            if( nums[i] == nums[i - 1] + 1 ){
                consecutive++;
            }
            else if( nums[i] == nums[i - 1] ) { // handles duplicate 
                continue; 
            }
            else{
                consecutive = 1; 
            }
            longest = Math.max(longest, consecutive); 
        }
        return longest; 
    }
}
