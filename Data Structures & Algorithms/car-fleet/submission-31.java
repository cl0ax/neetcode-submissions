class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length; 
        Deque<Double> stack = new ArrayDeque<>();

        int[][] cars = new int[n][2];

        for(int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Collections.sort(cars, (a, b) -> b[0] - a[0]);

        for(int[] car : cars ){
            double time = (double) target - car[0]; 

            Double eta =  (double) time / car[1];

            if( stack.isEmpty() || eta > stack.peek() ){
                stack.push(eta);
            }
            
        }

        return stack.size();
    }
}
