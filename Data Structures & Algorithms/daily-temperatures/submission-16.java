class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();

        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];

            if( stack.isEmpty() || temp > stack.peek()[1] ) {
                stack.push(new int[]{i, temp});
                int[] arr = stack.pop();
                result[i] = (i - arr[0]);
                stack.push(new int[]{i, temp});
            }
        }
        return result;
    }
}
