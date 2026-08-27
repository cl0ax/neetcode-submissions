class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();
        

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            count.put(num, count.getOrDefault(num, 0) + 1);
        }


        List<Integer> list = new ArrayList<>();
        for(Integer key : count.keySet() ) { 
            list.add(key);
        }
        Collections.sort(list, (a, b) -> list.get(a) - list.get(b));
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = list.get(i);
        }

        return result;
    }
    
}
