class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0; 
        int curr = 0; 

        Arrays.sort(nums);

        for( int num : nums ) {
            set.add(num);
        }

        for( int i = 0; i < nums.length; i++ ) {
            
            if( set.contains( nums[i - 1] + 1 ) ){ // handles the run 
                curr++; 
            }
            else if( set.contains(nums[i]) ){ // handles dupes
                continue; 
            }
            else{
                curr = 0; 
            }
            longest = Math.max(set.size(), curr);
        }
        return longest; 
    }
}
