class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left = 0; 
        int right = nums.length - 1;
        int middle = nums.length / 2; 
        Arrays.sort(nums);

        //place to store correct pairs | == 0 
        List<List<Integer>> result = new ArrayList<>();

        while(left < right){
            int sum = nums[left] + nums[middle] + nums[right];
            if(sum == 0){
                //result.add(new ArrayList<>nums[left], nums[middle], nums[right]);
            }
            if(sum < 0){
                middle++;
            }
            else{
                middle--;
            }
        }
        return result;
    }
}
