class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = 0; j < nums.length; j++){
                
                if(j == i){
                    continue;
                }
                product *= nums[j];
                

            }
            result[i] = product;
        }
        return result;
    }
}  
/*
Big-O Notation/Complexity

Time: O(n)^2
- becuase we utilize two loops to loop over the nums array.

Space: O(n)
- because didn't utilize additional allocated space
- 

*/
