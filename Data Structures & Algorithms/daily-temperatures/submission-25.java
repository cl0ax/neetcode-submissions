class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < temperatures.length; i++) {
            int count = 0;
            while( !stack.isEmpty() && temperatures[i] > stack.peek()) {
                
            }
            stack.push(todays_temp);
        }
    }
}
