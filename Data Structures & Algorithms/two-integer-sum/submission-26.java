class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(count.containsKey(diff)){
                return new int[]{count.get(diff), i};
            }
            count.put(diff, i);
            

        }
        return new int[]{};
    }
}
