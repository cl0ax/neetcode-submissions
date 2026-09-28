class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boat_counter = 0;

        while (left <= right) {
            int boat_weight = people[left] + people[right];
            if (boat_weight <= limit) {
                left++;
            }
            right--; 
            boat_counter++;
        }

        return boat_counter;
    }
}