class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int area = 0;
        while( left < right ){
            int shorter = Math.min(heights[left], heights[right]);
            area = Math.max(area, shorter * (right - left));
            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}
