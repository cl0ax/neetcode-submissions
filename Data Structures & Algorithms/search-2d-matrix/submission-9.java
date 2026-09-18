class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;

        while( top <= bottom ) {
            int mid = top + ( bottom - top ) / 2;              // was (top - bottom)

            if( target < matrix[mid][0] ) {                    // NEW: whole row is too big, go up
                bottom = mid - 1;
            }
            else if( target > matrix[mid][matrix[mid].length - 1] ) {  // NEW: whole row too small, go down
                top = mid + 1;
            }
            else {                                             // target can only be in row mid
                int left = 0;                                  // was matrix[top]
                int right = matrix[mid].length - 1;

                while( left <= right ) {
                    int col = left + ( right - left ) / 2;     // NEW: column midpoint
                    if( matrix[mid][col] == target ) {
                        return true;
                    }
                    else if( matrix[mid][col] < target ) {
                        left = col + 1;                        // was right + 1
                    }
                    else {
                        right = col - 1;                       // was left - 1
                    }
                }
                return false;                                  // right row, not in it
            }
        }
        return false;
    }
}