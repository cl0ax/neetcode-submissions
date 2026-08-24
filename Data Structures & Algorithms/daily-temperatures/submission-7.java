class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            if( !stack.isEmpty() || temp >  ) {
                stack.push(temp);
            }
        }
    }
}
