class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //where we're storing the num and count
        Map<Integer, Integer> count = new HashMap<>();

        //fills the count's <number, it's count>
        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        //holds int[] of 
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }
        //sorting in descending order somehow?
        arr.sort((a, b) -> b[0] - a[0]);

        //storitng the results
        int[] res = new int[k];
        for(int i = 0; i < k; i++){ //size is equal to k 
            res[i] = arr.get(i)[1]; //get's the int[] and thier numvers
        }
        return res;
    }
}
