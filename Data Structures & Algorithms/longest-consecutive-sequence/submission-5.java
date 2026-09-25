class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> sequence = new HashMap<>();
        int length = 0; 
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            sequence.put(i, nums[i]);
        }

        for( int idx = 0; idx < nums.length; idx++ ) {
            if( nums[idx] != sequence.get(idx) - 1  ) {
                length = idx; 
            }
           
        }
        return length; 
    }
}
