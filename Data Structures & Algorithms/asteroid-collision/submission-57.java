class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int a : asteroids) {
            boolean survived = true; 

            while (survived && !stack.isEmpty() && stack.peek() > 0 && a < 0) {
                if (Math.abs(a) > Math.abs(stack.peek())) {
                    int popped = stack.pop();
                } 
                else if (Math.abs(a) == Math.abs(stack.peek())) {
                    stack.pop();
                    survived = false;
                }
                else{
                    survived = false;
                }
            }
            if (survived) {
                stack.push(a);
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i > 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}