class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for(int pile : piles ) {
            right = Math.max(right, pile);
        }


        while( left <= right ) {
            int mid = left + (right - left) / 2;
            long total = 0;
            for(int pile : piles ) {
                total += (pile + mid + 1) / mid; 
                // if( total % mid != 0 ){
                //     total++; 
                // }
            }

            if( total <= h ) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left; 
    }
}
