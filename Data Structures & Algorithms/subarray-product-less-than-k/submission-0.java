class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int count = 0;
        int sum = 1;

        //<idx, sum> prefix 
        Map<Integer, Integer> prefix = new HashMap<>();

        if( k == 0){
            return 0;
        }
        
        for(int right = 0; right < nums.length; right++){
            if(nums[right] < k){
                count++;
            }
            sum *= nums[right];
            prefix.put(right, sum);
            if(sum < k){
                count++;
            }

            while ( sum > k ){
                sum -= prefix.get(left);
                if( sum < k){
                    count++;
                }
                left++;
                //prefix.remove(left);
            }

            //subArrCount = Math.max(subArrCount, (right - left + 1));
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