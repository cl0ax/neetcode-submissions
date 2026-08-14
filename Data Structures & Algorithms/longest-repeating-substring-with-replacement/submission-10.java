class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> window = new HashMap<>();
        int left = 0;
        int maxFreq = 0; //the count of most Freq char
        int longestSubStr = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            
            window.put(c, window.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, window.get(c));
            
            while( (right - left + 1) - maxFreq > k){
                window.put(s.charAt(left), window.getOrDefault(s.charAt(left), 0) - 1);
                left++;
                
                
            }



            longestSubStr = Math.max(longestSubStr, right - left + 1);
            

        }
        return longestSubStr;
    }
}
