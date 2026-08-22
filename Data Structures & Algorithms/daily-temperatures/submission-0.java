class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatrues.length];

        while(i < temperatures.length ){
            int currT = temperatures[i];
            int count = 0;

            for(int j = i + 1; j < temperatures.length; j++){
                
                int futureT = temperatures[j];

                if(futureT > currT ){
                    count++;
                }
                result[i] = count;
            }
            i++;
        }
        return result;
    }
}
