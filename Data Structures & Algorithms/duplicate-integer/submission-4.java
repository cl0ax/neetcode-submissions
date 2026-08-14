class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> actual = new HashSet<>(); 

        for(int i = 0; i < nums.length; i++){
            if(actual.contains(nums[i])){
                return true;
            }
            actual.add(nums[i]);
        }
        return false;
    }
}