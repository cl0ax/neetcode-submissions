class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;

        while( top <= bottom ) {
            int row = top + (bottom - top) / 2;

            if( matrix[row][0] < target ) {
                top = bottom + 1; //focuses on right side

            }
            else if( matrix[row][0] > target ) {
                bottom = top - 1;
            }
            else {
                int left = 0;
                int right = matrix[row][matrix[row].length - 1];
                while()
            }
        }
        return false; 
    }
}
