class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        
        //<uniqueN, frequency count>
        Map<Integer, Integer> res = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(res.containsKey(nums[i])){
                res.get(nums[i] + 1);
            }
            if(res.containsKey(res.get(nums[i])) < k){
                res.getOrDefault(nums[i], 0 + 1);
            }
        }
        return nums;
    }
}
