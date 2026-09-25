class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            int mid = left + (right - left) / 2;
            for (Map.Entry<Integer, Integer> e : numbers.entrySet()) {
                if (nums[mid] > nums[right] ) {
                    left = mid + 1;
                } 
                else {
                    right = mid;
                                }
            }
            
        }
        return nums[left];
    }
}
