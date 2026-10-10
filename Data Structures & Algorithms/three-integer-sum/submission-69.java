class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left = 0;
        int right = nums.length - 1; 
        List<List<Integer>> list = new ArrayList<>(); 


        while( left < right ) {
            int i = 0; 
            int sum = nums[left] + nums[i] + nums[right];
            while( left == i ) {
                i++; 
            }
            
             
            if( sum == 0 ){
                list.add( Arrays.asList(nums[left], nums[i], nums[right]) ); 
            }
        }
        return list; 
    }
}
