class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0; 
        int right = numbers.length - 1;

        while(left < right){
            //creates a new sum everh iteration
            int sum = numbers[left] + numbers[right];
            //compares to see if sum is bigger or smaller 

            if(sum == target){
                return new int[]{left + 1, right + 1};
            }
            //acts appropriately/conditional movement
            if( sum < target){ //if sum is smaller
                left++;
            }
            else{//if it's bigger
                right--;
            }
            
        }
        return new int[]{};
    }
}
