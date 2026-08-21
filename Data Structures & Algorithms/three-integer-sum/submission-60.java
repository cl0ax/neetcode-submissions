class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0;
        int sum = 0;
        List<List<Integer>> result = new ArrayList<>();
        for(int j = i + 1; j < nums.length; j++){
            int k = j + 1;
            while( j < k ){
                sum = nums[i] + nums[k] + nums[j]; 
                if( sum == 0 ){
                    result.add(Arrays.asList(nums[i], nums[k], nums[j]));
                }
                while(j < k && nums[j] == nums[j - 1]){
                    j++;
                }
                while(j < k && nums[k] == nums[k - 1]){
                    k++;
                }
            }
        }
        return result;
    }
}
