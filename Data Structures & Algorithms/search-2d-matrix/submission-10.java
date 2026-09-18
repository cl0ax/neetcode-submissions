class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;

        while( top <= bottom ) {
            int row = top + (bottom - top) / 2;

            if( matrix[row][0] < target ) {
                top = bottom + 1; //focuses on right side

            }
            else if( matrix[row][0])
        }
        return false; 
    }
}
