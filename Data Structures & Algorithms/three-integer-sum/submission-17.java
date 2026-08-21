class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        

        Arrays.sort(nums);
        //where we will store the indices that meet condition
        List<List<Integer>> result = new ArrayList<>();

        //for loop = fixed position/i
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            int target = 0;
            


            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                
                //adds it to the List as List of integers
                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //we increment to find new pairs
                    left++;
                    //we decrement here so the sum remains stable (0) 
                    right--;
                    if(nums[left] == nums[left - 1]){
                        left++;
                    }
                    else if( nums[right] == nums[right + 1]){
                        right--;
                    }
                }
                
                //if left is a duplicant of elem before it 
                if(left < right && sum < target){
                    left++;
                }
                else if(left < right && sum > target){ //if right is a duplicant of elem after it 
                    right--;
                }
            }
        }
        return result;
    }
}
