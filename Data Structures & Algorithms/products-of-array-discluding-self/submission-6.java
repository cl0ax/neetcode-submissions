class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];

        int[] result = new int[nums.length];
        int product = 1;
        int suffix = 1;
        
        for(int i = 0; i < nums.length; i++){
            product *= nums[i];
            prefix[i] = product;
        }

        result[0] = 1;
        for(int i = 0; i < nums.length; i++){
            
            result[i] *= suffix;
            
        }
        return result; }
}  
