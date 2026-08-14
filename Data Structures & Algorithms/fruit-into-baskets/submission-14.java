class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> window  = new HashMap<>();
        int left = 0;
        int maxC = 0;
        for(int right = 0; right < fruits.length; right++){
            int fruit = fruits[right];
            window.put(fruit, window.getOrDefault(fruit, 0) + 1);
            
            while( window.size() > 2 ){
                int l_fruit = fruits[left];
                window.put(l_fruit, window.get(l_fruit) - 1);
                if(window.get(l_fruit) == 0){
                    window.remove(l_fruit);
                }
                left++;
            }


            maxC = Math.max(maxC, (right - left + 1));
        }
        return maxC;
    }
}