class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 1; 
        int curr = 1; 

        Arrays.sort(nums);

        for( int num : nums ) {
            set.add(num);
        }

        for( int i = 1; i < nums.length; i++ ) {
            
            if( set.contains( nums[i - 1] + 1 ) ){ // handles the run 
                curr++; 
            }
            else if( set.contains(nums[i]) ){ // handles dupes
                continue; 
            }
            else{
                curr = 1; 
            }
            longest = Math.max(longest, curr);
        }
        return longest; 
    }
}
