class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1; 

        while( top <= bottom ) {
            int mid = top + ( top - bottom ) / 2;
            int left = matrix[top]; 
            int right = matrix[bottom].length - 1; 
            while( left <= right ) {
                if( matrix[top][left] == target ){
                    return true;
                }
                else if( matrix[top][left] < target ) {
                    left = right + 1;
                }
                else{
                    right = left - 1;
                }
            }
        }
        return false;
    }
}
