class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int max = 0;
        for(int right = 0; right < fruits.length; right++ ){
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            while( basket.size() > 2 ){
                basket.put(fruits[left], basket.getOrDefault(fruits[left], 0) - 1);
                left++;
                if( basket.get(fruits[right]) == 0){
                    basket.remove(left);
                }
                
                
                
            }

            max = Math.max(max, (right - left) + 1);
        }
        return max;
    }
}