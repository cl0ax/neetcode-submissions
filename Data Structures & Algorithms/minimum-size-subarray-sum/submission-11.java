class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            int r_num = nums[right];
            sum += r_num;

            while( sum > target ){
                int l_num = nums[left];
                minLength = Math.min(minLength, (right - left + 1));
                sum -= l_num;
                left++;
            }
        }

        if( minLength == Integer.MAX_VALUE ){
            return 0;
        }
        else{
            return minLength;
        }
    }
}