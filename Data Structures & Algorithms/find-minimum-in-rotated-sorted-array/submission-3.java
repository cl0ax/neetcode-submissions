class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        HashMap<Integer, Integer> numbers = new HashMap<>();
        // for(int i = 0; i < nums.length - 1; i++ ) {
        //     numbers.put()
        // }
        int min = 0; 

        while( left <= right ) {
            int mid = left + (right - left) / 2;
            numbers.put(mid, nums[mid]);
            for(Map.Entry<Integer, Integer> e : numbers.entrySet() ){
                if(nums[mid] > nums[e.getKey()] ) {
                    left = right - 1;
                }
                else if (nums[mid] < nums[e.getKey()]){
                    right = left + 1;
                }
                else{
                    min = Math.min(nums[mid], nums[e.getKey()]);
                }
            }
            
        }
        return min; 
    }
}
