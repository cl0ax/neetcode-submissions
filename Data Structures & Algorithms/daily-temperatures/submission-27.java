class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            int count = 0;
            while( !stack.isEmpty() && temperatures[i] > stack.peek()) {
                
            }
            stack.push(temperatures[i]);
        }
        return 
    }
}
