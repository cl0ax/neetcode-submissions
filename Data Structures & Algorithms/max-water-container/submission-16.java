class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int maxArea = 1; 
        int right = heights.length - 1;
        while( left < right ){
            maxArea = Math.max(maxArea, minHeight * (right - left) );
            int minHeight = Math.min(heights[left] , heights[right]);

            
            
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
