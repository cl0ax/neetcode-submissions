class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0; 
        int right = people.length - 1; 
        int min_Count = 0; 

        Arrays.sort(people); 

        while( left <= right ) {
            int count = 0; 

            if( !(people[right] + people[left] <= limit) ){
                count++; 
                right--; 
            }
            // else{

            // }


            min_Count = Math.min(min_Count, count);
        }
        return min_Count; 
    }
}