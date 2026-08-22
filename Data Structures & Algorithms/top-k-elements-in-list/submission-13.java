class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++ ){
            int num = nums[i];

            count.put(i, num);
        }
    }
}
