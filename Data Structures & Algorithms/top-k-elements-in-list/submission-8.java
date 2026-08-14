class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //<num, frequency>
        Map<Integer, Integer> count = new HashMap<>();
        //should fill in the count nicely
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        //creates a list of the keys (signature nums/unique nums)
        List<Integer> keys = new ArrayList<>(count.keySet()); 
        //sorting them to top k
        keys.sort( (a, b) -> count.get(b) - count.get(a) );

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = keys.get(i);
        }

        return result;
    }
}
