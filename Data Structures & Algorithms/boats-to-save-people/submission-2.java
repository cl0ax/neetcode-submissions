class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0; 
        //int right = people.length - 1; 
        int boat_counter = 0; 
        int MAX_PER_BOAT = 2;     

        for(int i = 0; i < people.length; i++) {
            for(int j = i + 1; j < people.length; j++ ) {
                int sum = people[i] + people[j]; 
                if( sum <= limit ) {
                    boat_counter++; 
                }
            }
        }
        return boat_couter; 
    }
}