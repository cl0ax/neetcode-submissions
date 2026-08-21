class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0; 
        int sum = 0;
        List<List<Integer>> result = new ArrayList<>();

        for(int j = 0; j < nums.length; j++){
            sum = nums[i] + nums[j] + nums[k];
            if( sum == 0 ){
                result.add(Array.asList([i, j, k]))
            }
            
        }
        return result;
    }
}
