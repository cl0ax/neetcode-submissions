class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> result = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones ){
            result.offer(stone);
        }

        while( result.size() > 1 ){
            int x = result.peek(); //should pull the 1st heaviest
            int y = result.peek(); //should pull the 2nd heaviest
            if( x < y){
                result.poll();
            }

        }
    }
}
