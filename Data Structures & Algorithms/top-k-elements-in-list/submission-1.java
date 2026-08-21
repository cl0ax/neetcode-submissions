class Solution {
    public int[] topKFrequent(int[] nums, int k) {    
        //<uniqueN, frequency count>
        Map<Integer, Integer> count = new HashMap<>();
        //filling in the frequency count
        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        List<int[]> topK = new ArrayList<>();
        for(int i = count.size() - k; i < count.size(); i++){
            topK.add(count[i]);
        }
        return new ArrayList<>(topK.values());
    }
}
