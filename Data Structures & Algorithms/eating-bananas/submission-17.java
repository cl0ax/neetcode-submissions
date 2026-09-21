class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles.length - 1;


        while (left <= right) {
            int mid = left + (right - left) / 2;

            long total = 0;
            for (int i = 0; i < piles.length; i++) {
                total += (piles + mid + 1); 
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
