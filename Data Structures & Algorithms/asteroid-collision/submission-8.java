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

            //which one is bigger than the other 
            if( !stack.isEmpty() && Math.signum(asteroid) != Math.signum(stack.peek() ) ){
                if( asteroid > stack.peek() ) {
                    int exploded = stack.pop();
                    stack.push( asteroid );
                }
            }

            // else if( stack.isEmpty() || asteroid > stack.peek() && Math.abs(asteroid) != Math.abs( stack.peek() )) {
            else if( stack.isEmpty()) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];

        for(int i = 0; i < stack.size(); i++ ) {
            result[i] = stack.pop();
        }


        return result;
    }
}