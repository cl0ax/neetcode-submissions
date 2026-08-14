class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        
        int[] prefix = new int[nums.length];
        int prefixProduct = 1;
        for(int i = 0; i < nums.length; i++){
            prefix[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        int[] suffix = new int[nums.length];
        int suffixProduct = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            suffix[i] = suffixProduct;
            suffixProduct *= nums[i];
        }

        for(int k = 0; k < nums.length; k++){
            result[k] = prefix[k] * suffix[k];
        }
        return result; }
}  
