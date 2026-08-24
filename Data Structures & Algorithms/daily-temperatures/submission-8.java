class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();

        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];

            if( !stack.isEmpty() || temp > stack.peek() ) {
                stack.push(new int[]{i, temp});
                result[i] = ()
            }
        }
    }
}
