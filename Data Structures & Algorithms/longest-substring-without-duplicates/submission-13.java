class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0; 
        int n = s.length(); 
        int longestRunning = 0; 

        Set<Character> window = new HashSet(); 


        while( left < right ) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if( !window.contains(leftChar) ) {
                window.add(leftChar);
            }

            if( left == right ) {
                right++; 
            }

            if( !window.contains(rightChar) ) {
                window.add(rightChar); 
                right++; 
            }
            else{
                longestRunning = Math.max( longestRunning, window.size() ); 
                while( window.contains( rightChar ) ) {
                    left++; 
                }                
            }
        }
        return longestRunning; 
    }
}
