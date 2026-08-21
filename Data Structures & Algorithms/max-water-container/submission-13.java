class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int maxArea = 1; 
        int right = heights.length - 1;
        while( left < right ){
            int minHeight = Math.min(heights[left] , heights[right]);

            
            maxArea = Math.max(maxArea, (minHeight * minHeight) );
            if( heights[left] < heights[right] ){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea; 
    }
}
