class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            //sum of bothe elemns
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left + 1, right + 1};
            }
        
            //smaller < target
            if(sum < target){ 
                left++;
            }
            else{
                right--;
            }
        }
        //bcuz it's 1 indexed
        return new int[]{};
    }
}
