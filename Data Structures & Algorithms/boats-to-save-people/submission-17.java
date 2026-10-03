class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0; 
        int right = people.length - 1; 
        // int min_Count = 1; 
        int count = 0; 

        Arrays.sort(people); 

        while( left <= right ) {
            int sum = people[right] + people[left]; 

            if(  sum <= limit ){
                count++; 
                right--;
                left++; 
            }
            else if( people[right] <= limit ) {
                count++; 
                right--; 
            }
            else{
                left++; 
            }


            //min_Count = Math.max(min_Count, count);
        }
        return count; 
    }
}