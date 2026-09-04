class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            

            while( !stack.isEmpty() && temperatures[i] > temperatures[stack.peek()] ) {
                int past_days = stack.pop();
                result[past_days] = (i - past_days);
            }
            
            stack.push(i);
            
        }
        return result;
    }
}
