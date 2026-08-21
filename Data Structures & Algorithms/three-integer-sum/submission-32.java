class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0; 
        int sum = 0;
        List<List<Integer>> result = new ArrayList<>();

        for(int j = 0; j < nums.length; j++){
            int k = 0;
            while( k < nums.length){
                while( j == i && j < nums.length|| nums[j] == nums[j - 1] && j < nums.length){
                    j++;
                }
                while(k == i && k < nums.length || k == j && k < nums.length || nums[k] == nums[k - 1] && k < nums.length ){
                    k++;
                }
                sum = nums[i] + nums[j] + nums[k];
                if( sum == 0 ){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
                j++;
                k++;
                //while()
            }
            i++;
            
            
        }
        return result;
    }
}
