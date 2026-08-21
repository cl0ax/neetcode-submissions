class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minSubArr = Integer.MAX_VALUE;
        int sum = 0;
        Map<Integer, Integer> window = new HashMap<>();

        for(int right = 0; right < nums.length; right++){
            int r_num = nums[right];
            sum += r_num;
            window.put(right, sum);
            //window.put(r_num, window.getOrDefault(r_num, 0) + 1);
            //sum += r_num;

            //while( sum < target ){
            if( sum >= target ){
                while( sum >= target){
                    minSubArr = Math.min(minSubArr, (right - left + 1));
                    sum -= nums[left];
                    left++;
                    
                }
                //int l_num = nums[left];
                //window.put(left, sum - window.get(left));
                // if(window.get(l_num) == 0){
                //     window.remove(l_num);
                //}

                //minSubArr = (right - left + 1);
                //left++;
            }
            //minSubArr = Math.min(minSubArr, (right - left + 1));
        
            
       }
       return 0;
    }
}