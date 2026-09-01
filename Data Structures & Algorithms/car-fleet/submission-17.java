class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length; 
        Deque<Integer> stack = new ArrayDeque<>();

        int[][] cars = new int[n][2];

        for(int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        for(int[] car : cars ){
            int eta = target - car[0] / car[1];

            if( stack.isEmpty() || eta > stack.peek() ){
                stack.push(eta);
            }
        }

        return stack.size();
    }
}
