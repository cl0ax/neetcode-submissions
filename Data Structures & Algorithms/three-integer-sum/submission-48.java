class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0; 
        int sum = 0;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int j = i + 1; j < nums.length; j++){
            int k = j + 1;
            while( k < nums.length){
                sum = nums[i] + nums[j] + nums[k];
                if( sum == 0 ){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
                //while( j == i && j < nums.length|| nums[j] == nums[j - 1] && j < nums.length){
                // while( j == i && j < nums.length || nums[j] == nums[k - 1] && j < nums.length){
                // while( j == i && j < nums.length ){
                while( sum > 0 && j < nums.length ){
                    j++;
                }
                //while(k == i && k < nums.length || k == j && k < nums.length|| nums[k] == nums[k - 1] && k < nums.length){
                // while(k == i && k < nums.length || k == j && k < nums.length){
                while( sum < 0 && k < nums.length ){
                    k++;
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
