class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int a : asteroids) {
            while (!stack.isEmpty() && stack.peek() > 0 && a < 0) {
                if (Math.abs(a) > Math.abs(stack.peek())) {
                    int popped = stack.pop();
                    stack.push(a);
                } else if (Math.abs(a) == Math.abs(stack.peek())) {
                    stack.pop();
                    break; 
                }
                else{
                    break;
                }
            }
            stack.push(a);
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i > 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}