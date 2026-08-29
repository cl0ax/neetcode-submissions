class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = position.length; 
        double driving_rate = 0; 
        int car_Fleet = 0;

        for(int i = 0; i < n; i++) {
            int diff = target - position[i]; 
            int mph = speed[i];
            int r = diff / mph; 
            while( !stack.isEmpty() && (target % mph == 0) ){
                car_Fleet++;
            }
            stack.push(i);
        }
        return car_Fleet;
    }
}
