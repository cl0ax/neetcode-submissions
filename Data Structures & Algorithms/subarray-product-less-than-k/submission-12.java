class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0; 
        }                      // ADDED: guard, no product is ever < 1
        int left = 0;
        int count = 0;
        int product = 1;                            // CHANGED: one running product, starts at 1
        // Arrays.sort(nums);                       // REMOVED: sorting breaks "contiguous"
        // singles loop                             // REMOVED: line 7 below counts singles
        // Set<Integer> window                      // REMOVED: not needed, the window is left..right

        for (int right = 0; right < nums.length; right++) {   // CHANGED: right walks every index
            product *= nums[right];                 // CHANGED: expand, multiply the new one in

            while (product >= k) {                  // CHANGED: your `if (product > k)` -> while, and >=
                product /= nums[left];              // ADDED: shrink, divide the old one out
                left++;
            }

            count += right - left + 1;              // ADDED: every subarray ending at right
        }
        return count;
    }
}