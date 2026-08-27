class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            while( !stack.isEmpty() && temperatures[i] > temperatures[stack.peek()] ) {
                int past_day = stack.pop(); //Unsure if I need to pop it or not or even save it in a variable but I'm just doing it for now 
                stack.push(i);
                result[past_day] = (i - past_day);
                

            }
            // int day = i; 
            stack.push(i);
        }
        return result;
    }
}
