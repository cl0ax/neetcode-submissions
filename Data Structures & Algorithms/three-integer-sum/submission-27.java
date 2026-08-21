class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0; 
        int sum = 0;
        List<List<Integer>> result = new ArrayList<>();

        for(int j = i + 1; j < nums.length; j++){
            int k = j + 1;
            while( k < nums.length){
                while(k == i){
                    k++;
                }
                while( j == i ){
                    j++;
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
