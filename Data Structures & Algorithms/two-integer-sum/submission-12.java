class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> has = new HashMap<>();

         for(int i = 0; i < nums.length; i++){
             has.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if( has.containsKey(diff)) {
                return new int[]{i, has.get(diff)};
            }
            //has.put(nums[i], i);
        }
        return new int[]{};
    }
}
