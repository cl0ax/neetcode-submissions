class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            count.put(diff, i);

            if( count.containsKey(diff) ){
                return new int[]{i, count.get(diff)};
            }
        }
        return new int[]{};
    }
}
