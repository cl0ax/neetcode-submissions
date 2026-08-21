class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> has = new HashMap<>();

       
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            while( i < nums.length){
                has.put(i, nums[i]);
                int diff = target - nums[i];
                if( has.containsValue(diff)) {
                    return new int[]{j, i};
                }
                i++;
                break;
            }
        }
        return new int[]{};
    }
}
