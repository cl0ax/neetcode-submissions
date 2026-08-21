class Solution {
    public int totalFruit(int[] fruits) {
        Set<Integer> basket = new HashSet<>();
        int left = 0;
        int max = 0;
        for(int right = 0; right < fruits.length; right++ ){
            basket.add(fruits[right]);
            
            

            while( basket.contains(fruits[right]) ){
                // if( basket.contains(fruits[right]) ){
                //     max++;
                // }
                basket.remove(fruits[left]);
                
                left++;
                
                
            }

            max = Math.max(max, (right - left) + 1);
        }
        return max;
    }
}