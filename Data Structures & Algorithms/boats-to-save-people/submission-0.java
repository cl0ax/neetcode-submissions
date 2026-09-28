class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0; 
        //int right = people.length - 1; 
        int boat_counter = 0; 
        int MAX_PER_BOAT = 2;     

        for( int right = left + 1; right < people.length; right++ ) {
            int boat_weight = people[left] + people[right];
            if( boat_weight <= limit ) {
                boat_counter++; 
            }
            


            boat_counter = Math.min(boat_counter, );
        }
    }
}