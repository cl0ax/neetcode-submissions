class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if( count.containsKey(nums[i]) ){
                return new int[]{count.get(nums[i]), i};
            }

            int diff = target - nums[i];

            
            count.put(diff, i);

            
        }
        return new int[]{};
    }
}
