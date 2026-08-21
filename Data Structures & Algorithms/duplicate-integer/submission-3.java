class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> found = new HashSet<>();
        for(int num : nums){
            if(found.contains(nums)){
                return true;
            }
            found.add(num);
        }
        return false;
    }
}