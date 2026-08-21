class Solution {
    public int[] productExceptSelf(int[] nums) {

        //variables we might need
        //int product; 

        //<index, prduct/sum> (excluding the index as the key)
        //HashMap<Integer, Integer> prefixSum = new HashMap<>();
        int[] prefixSum = new int[nums.length];
        for(int i = 0; i < nums.length - 1; i++){
            int product = nums[i + 1];
            product *= nums[i];
            prefixSum[i] = product;
        }
        return prefixSum;

    }
}  
