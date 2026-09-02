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
            if( !stack.isEmpty() && asteroid > stack.peek() && Math.signum(asteroid) != Math.signum(stack.peek() ) ){
                int exploded = stack.pop();
                stack.push( asteroid );
            }

            if( stack.isEmpty() || asteroid > stack.peek() && Math.abs(asteroid) != Math.abs( stack.peek() )) {
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