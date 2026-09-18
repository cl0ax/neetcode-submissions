class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0
        int right = piles.length - 1;

        Set<Integer> count = new HashSet<>();
        Arrays.sort(piles);

        for(int i = 0; i < piles.length; i++) {
            count.add(piles[i]);
        }

        while( left <= right ) {
            int mid = left + (right - left) / 2;

            if( piles[mid] < h ) {

            }
        }
    }
}
