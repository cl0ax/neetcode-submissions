class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left = 0;
        int right = nums.length - 1; 
        List<Integer> list = new ArrayList<>(); 


        while( left < right ) {
            int i = 0; 
            while( left == i ) {
                i++; 
            }
            int sum = nums[left] + nums[i] + nums[right]; 
            if( sum == 0 ){
                list.add( Arrays.asList(left, i, right) ); 
            }
        }
    }
}
