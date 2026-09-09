class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;

        while( left <= right ) {
            int mid = left + (right - left) / 2;

            if( matrix[mid][0] == target ) {
                return true; 
            }
            else if( matrix[mid][0] > target ) {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }
}
