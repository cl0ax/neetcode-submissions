class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();
        

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int[] results = new int[k];
        for()
    }
    return result;
}
