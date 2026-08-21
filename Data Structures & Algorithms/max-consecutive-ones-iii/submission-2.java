class Solution {
    public int longestOnes(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(sum == 0){
            return 0;
        }
        Map<Integer, Integer> window = new HashMap<>();
        int l = 0;
        int maxFreq = 0;
        int maxC = 0;
        for(int r = 0; r < nums.length; r++){
            window.put(nums[r], window.getOrDefault(nums[r], 0) + 1);
            maxFreq = Math.max(maxFreq, window.get(nums[r])); 

            while( (r - l + 1 ) - maxFreq > k){
                window.put(nums[l], window.get(nums[l]) - 1);
                if(window.get(nums[l]) == 0){
                    window.remove(nums[l]);
                }
                l++;
            }
            maxC = Math.max(maxC, r - l + 1);
        }
        return maxC;

    }
}