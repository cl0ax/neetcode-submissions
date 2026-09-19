class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;

        while( top <= bottom ) {
            int row = top + (bottom - top) / 2;

            if( matrix[row][0] < target ) {
                bottom = row - 1;
            }
            else if( matrix[row][matrix[row].length - 1] > target ) {
                
                top = row + 1;
            }
            else{
                int left = 0;
                int right = matrix[row].length - 1;
                while( left <= right ) {
                    int col = left + (right - left) / 2;

                    if( matrix[row][col] == target ) {
                        return true;
                    }
                    else if( matrix[row][col] < target ) {
                        right = col - 1;
                    }
                    else {
                        left = col + 1;
                    }
                }
                return false;
            }
        }
        return false; 
    }
}
