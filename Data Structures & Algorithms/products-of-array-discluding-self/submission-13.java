class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Map<Integer, Integer> prefix = new HashMap<>();
        int[] prefix = new int[nums.length];
        int pSum = 1;
        for(int i = 0; i < nums.length; i++){
            //prefix.put(pSum);
            prefix[i] = pSum;
            pSum *= nums[i];
        }

        //Map<Integer, Integer> suffix = new HashMap<>();
        int[] suffix = new int[nums.length];
        int sSum = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            //suffix.put(sSum);
            suffix[i] = sSum;
            sSum *= nums[i];
        }

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}  
