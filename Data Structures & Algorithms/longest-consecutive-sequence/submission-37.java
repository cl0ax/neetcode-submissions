class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0; 

        Arrays.sort(nums);

        for( int num : nums ) {
            set.add(num);
        }

        for( int num : nums ) {
            
            if( !set.contains( nums - 1 ) ){ // handles the run 
                int curr = 1; 
                while( set.contains( num + curr ) ) {
                    curr++; 
                }
                longest = Math.max(longest, curr);
            }   
        }
        return longest; 
    }
}
