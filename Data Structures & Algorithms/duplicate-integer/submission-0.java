//Pairwise Method
//brute-force nested loop
//SLOW | (O(n^2))
class Solution {
    public boolean hasDuplicate(int[] nums) {
        int left_p;
        int right_p;
        for(left_p = 0; left_p < nums.length; left_p++){
            for(right_p = left_p + 1; right_p < nums.length; right_p++){
                if(nums[left_p] == nums[right_p]){
                    return true;
                }
        }
    }
    return false;
}
}
