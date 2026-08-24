class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();

        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];

            if( stack.isEmpty() || temp > stack.peek()[1] ) {
                if(stack.isEmpty() ){
                    stack.push(new int[]{i, temp});
                }
                else{
                    int[] arr = stack.pop();
                    int lastDay = arr[0];
                    result[i] = i - lastDay;
                    stack.push(new int[]{i, temp});
                }
                
            }
        }
        return result;
    }
}
