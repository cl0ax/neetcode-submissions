class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(!window.contains(s.charAt(j))){
                window.add(s.charAt(j));
                j++;
            }
            if(window.contains(s.charAt(j))){
                while(window.contains(s.charAt(j))){
                    window.remove(s.charAt(i));
                    i++;
                }
                
            }
        }
        return window.size();
    }
}
