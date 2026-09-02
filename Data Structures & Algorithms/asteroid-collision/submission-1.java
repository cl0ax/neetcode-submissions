class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        int direction = 0;
        for( int asteroid : asteroids ) {
            //direction 
            if( Math.signum(asteroid) == 1) { //positive
                direction = 1; 
            }
            else{
                direction = -1;
            }
            if( stack.isEmpty() || asteroid > stack.peek() ) {
                stack.push(asteroid);
            }
        }
        return 
    }
}