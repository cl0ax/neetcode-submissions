class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        //num, count
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(seen.contains(nums[i])){ //has been seem before
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }
}