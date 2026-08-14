class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int count = 0;
        int product = 1;

        if( k <= 1){
            return 0;
        }
        for(int right = 0; right < nums.length; right++){
            product *= nums[right];
            

            while ( product >= k ){
                product = product / nums[left];
                left++;
            }

            count += (right - left + 1);
        }
        return count;
    }
}

/*
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int subArrCount = 0;
        int sum = 1;
        //<idx, sum> prefix 
        Map<Integer, Integer> prefix = new HashMap<>();
        for(int right = 0; right < nums.length; right++){
            sum *= nums[right];
            prefix.put(right, sum);

            while ( sum >= 100 ){
                sum -= prefix.get(left);
                prefix.remove(left);
                left++;
            }

            subArrCount = Math.max(subArrCount, (right - left + 1));
        }
        return subArrCount;
    }
}
*/