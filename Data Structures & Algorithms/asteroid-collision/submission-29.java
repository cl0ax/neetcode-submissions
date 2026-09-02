class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        int direction = 0;
        for( int asteroid : asteroids ) {
    
            //which one is bigger than the other 
            while( !stack.isEmpty() && Math.signum(asteroid) != Math.signum(stack.peek() ) ){
                if( Math.abs(asteroid) > Math.abs(stack.peek()) ) {
                    int exploded = stack.pop();
                    stack.push( asteroid );
                }
                else if( Math.abs(asteroid) == Math.abs(stack.peek())) {
                    int exploded_1 = stack.pop();
                }
                else{
                    continue;
                }
            }
            while( !stack.isEmpty() && Math.signum(asteroid) == Math.signum(stack.peek() ) ){
                stack.push(asteroid); 
            }

            // else if( stack.isEmpty() || asteroid > stack.peek() && Math.abs(asteroid) != Math.abs( stack.peek() )) {
            else if( stack.isEmpty()) {
                stack.push(asteroid);
            }
        }
        if(stack.isEmpty() ){
            return new int[]{};
        }

        int[] result = new int[stack.size()];

        int i = 0;
        while ( i <= stack.size() ) {
            result[i] = stack.pop();
            i++;
        }
        Arrays.sort(result);



        return result;
    }
}