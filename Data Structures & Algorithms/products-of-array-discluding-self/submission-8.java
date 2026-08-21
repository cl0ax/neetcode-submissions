class Solution {
    public int[] productExceptSelf(int[] nums) {
        Map<Integer, Integer> prefix = new HashMap<>();
        int prefixProduct = 1;
        for(int i = 0; i < nums.length; i++){
            prefixProduct *= nums[i];
            prefix.put(i, prefixProduct);
        }

        Map<Integer, Integer> suffix = new HashMap<>();
        int suffixProduct = 1;
        for(int i = nums.length; i > nums.length; i--){
            suffixProduct *= nums[i];
            prefix.put(i, sufficProduct);
        }

        int[] outputProduct = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            product = prefix.get(i) * suffix.get(i);
            outputProduct[i] = product;
        }
        return outputProduct;
    }
}  
