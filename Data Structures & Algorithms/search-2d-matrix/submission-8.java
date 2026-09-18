class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1; 

        while( top <= bottom ) {
            int mid = top + ( top - bottom ) / 2;

            if( target < matrix[mid][0] ) {
                bottom = mid - 1;
            }
            else if( target > matrix[mid][matrix[mid].length - 1] ) {
                top = bottom + 1;
            }
            else{ 
                int left = 0;
                int right = matrix[mid].length - 1;
                while( left <= right ) {
                    int col = left + (right - left) / 2;

                    if( matrix[mid][col] == target ) {
                        return true; 
                    }
                    else if ( matrix[mid][col] < target ) {
                        left = col + 1;
                    }
                    else{
                        right = col - 1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
