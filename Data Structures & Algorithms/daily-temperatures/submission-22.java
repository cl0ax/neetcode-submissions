class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();

        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                //int[] arr = stack.pop();
                //int lastDay = arr[0];
                int prevDay = stack.pop();
                result[prevDay] = i - prevDay;
                
            }
            stack.push(i);
        }
        return result;
    }
}
