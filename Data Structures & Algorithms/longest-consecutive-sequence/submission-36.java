class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0; 

        Arrays.sort(nums);

        for( int num : nums ) {
            set.add(num);
        }

        for( int i = 1; i < nums.length; i++ ) {
            
            if( !set.contains( nums[i - 1] ) ){ // handles the run 
                int curr = 1; 
                while( set.contains( num[i] + curr ) ) {
                    curr++; 
                }
                longest = Math.max(longest, curr);
            }   
        }
        return longest; 
    }
}
