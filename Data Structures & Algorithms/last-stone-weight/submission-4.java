class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> result = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones ){
            // if( x < stone ){
            //     x = stone; //should get highest one 
            // }
            result.offer(stone);
        }

        while( result.size() > 1 ){
            int x = result.peek(); //should pull the 1st heaviest
            int y = result.peek(); //should pull the 2nd heaviest
            if( x < y){
                x = result.poll();
                y = y - x;
            }
            else {
                y = result.poll();
                x = x - y;
            }
        }
        if( result.isEmpty() ){
            return 0;
        }
        else {
            return result.size();
        }
    }
}
