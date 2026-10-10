class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        while (left <= right) {
            for (int i = left + 1; i < nums.length; i++) {
                int sum = nums[left] + nums[i] + nums[right];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[left], nums[i], nums[right]));
                    // left++;
                    // right--;
                }
                else if( sum < 0 ){
                    left++; 
                }
                else{
                    right--; 
                }
            }
        }
        return list;
    }
}
