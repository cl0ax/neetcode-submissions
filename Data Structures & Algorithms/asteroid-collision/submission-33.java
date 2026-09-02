class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int asteroid : asteroids) {
            boolean survived = true;

            // a collision needs a right-mover on the stack meeting a left-mover
            while (survived && !stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                if (Math.abs(asteroid) > Math.abs(stack.peek())) {
                    stack.pop();          // top explodes, keep testing the new top
                } else if (Math.abs(asteroid) == Math.abs(stack.peek())) {
                    stack.pop();          // both explode
                    survived = false;
                } else {
                    survived = false;     // incoming explodes
                }
            }

            if (survived) stack.push(asteroid);
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();      // pop gives top first, so fill backwards
        }
        return result;
    }
}