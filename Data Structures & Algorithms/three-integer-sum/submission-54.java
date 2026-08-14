class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // int i = 0; 
        // int sum = 0;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        // for(int j = i + 1; j < nums.length; j++){
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while( j < k ) {
                int sum = nums[i] + nums[j] + nums[k];
                //while( j == i && j < nums.length|| nums[j] == nums[j - 1] && j < nums.length){
                // while( j == i && j < nums.length || nums[j] == nums[k - 1] && j < nums.length){
                // while( j == i && j < nums.length ){
                if ( sum < 0 ){
                    j++;
                }
                //while(k == i && k < nums.length || k == j && k < nums.length|| nums[k] == nums[k - 1] && k < nums.length){
                // while(k == i && k < nums.length || k == j && k < nums.length){
                else if ( sum > 0 ){
                    k--;
                }
                else{
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while( j < k && nums[j] == nums[j - 1]){
                        j++;
                    }
                }
            }
        }
        return result;
    }
}
