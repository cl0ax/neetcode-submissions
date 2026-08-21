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
            int x = result.poll(); //should pull the 1st heaviest
            int y = result.poll(); //should pull the 2nd heaviest
            if( x < y){
                y = y - x;
                result.offer(y);
            }
            else {
                x = x - y;
                result.offer(x);
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
