class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++ ){
            int num = nums[i];

            if(count.containsKey(num)){
                count.getOrDefault(num, count.get(num) + 1);
            }
            count.put(num, 1);
        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = count.get(i);
        
        }
        return result;
    }
}
