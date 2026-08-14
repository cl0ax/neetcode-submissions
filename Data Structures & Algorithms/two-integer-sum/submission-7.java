class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(count.containsKey(complement)){
                return new int[]{count.get(complement), i};
            }
            count.put(nums[i], i);

        }
        return new int[]{};
    }
}
