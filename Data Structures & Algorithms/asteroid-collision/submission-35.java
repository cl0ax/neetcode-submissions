class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        int a = 0; 

        for( a : asteroids) {
            while( !stack.isEmpty() && stack.peek() > 0 && a < 0) {
                if(Math.abs(a) > Math.abs(stack.peek())){
                    int popped = stack.pop();
                    stack.push(a);
                }
            }
            while( !stack.isEmpty() && stack.peek() < 0 && a > 0 ) {
                if(Math.abs(a) < Math.abs(stack.peek())){
                    
                }
            }
        }
    }
}