    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> count = new HashMap<>();
            for(int num : nums){
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
            List<Integer> keys = new ArrayList<>();
            for(Integer key : count.keySet()){
                keys.add(key);
            }
            Collections.sort(keys, (a, b) -> count.get(b) - count.get(a));



            int[] res = new int[k];
            for(int i = 0; i < k; i++){
                res[i] = keys.get(i);
            }
            return res;
        }
    }
