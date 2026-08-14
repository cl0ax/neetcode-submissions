class Solution {
    public int[] productExceptSelf(int[] nums) {
        Map<Integer, Integer> prefix = new HashMap<>();
        int prefixProduct = 1;
        for(int i = 0; i < nums.length; i++){
            prefix.put(i, prefixProduct);
            prefixProduct *= nums[i];
        }

        Map<Integer, Integer> suffix = new HashMap<>();
        int suffixProduct = 1;
        for(int j = nums.length - 1; j >= 0; j--){
            suffix.put(j, suffixProduct);
            suffixProduct *= nums[j];
            
        }

        int[] outputProduct = new int[nums.length];
        int product = 1; 
        for(int i = 0; i < nums.length; i++){
            product = prefix.get(i) * suffix.get(i);
            outputProduct[i] = product;
        }
        return outputProduct;
    }
}  
