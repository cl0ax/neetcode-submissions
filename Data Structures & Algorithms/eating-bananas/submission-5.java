class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int total = 0;

        int left = 1;
        int right = max;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            for (int pile : piles) {
                total += pile / mid;
                if (pile % mid != 0) {
                    total++;
                }
            }
            if(total <= h ) {
                right = mid + 1;
            }
            else{
                left = mid - 1;
            }
        }
        return total; 
    }
}
