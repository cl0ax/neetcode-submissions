class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0; 
        //int right = people.length - 1; 
        int boat_counter = 0; 
        int MAX_PER_BOAT = 2;     

        for(int p : people) {
            if( p <= limit ) {
                boat_counter++; 
            }
        }

        for( int right = left + 1; right < people.length; right++ ) {
            int boat_weight = people[left] + people[right];
            while( boat_weight <= limit ) {
                boat_counter++; 
            }
            


            
        }
    }
}