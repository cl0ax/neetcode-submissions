class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            while( stack.isEmpty() || temperatures[i] > temperatures[stack.peek()] ) {
                stack.push(i);
                result[stack.peek()] = (i - stack.peek());
                

            }
            // int day = i; 
            //stack.push(i);
        }
        return result;
    }
}
