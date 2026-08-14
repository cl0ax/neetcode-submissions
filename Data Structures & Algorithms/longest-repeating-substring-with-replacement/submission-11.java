class Solution {
    public int characterReplacement(String s, int k) {
        int shrinkP = 0;
        int maxFreq = 0;
        int longestSubStr = 0;
        Map<Character, Integer> window = new HashMap<>();

        for(int expandingP = 0; expandingP < s.length(); expandingP++ ){
            char c = s.charAt(expandingP);
            window.put(c, window.getOrDefault(c, 0) + 1); //creates count

            maxFreq = Math.max(maxFreq, window.get(c) );

            while( (expandingP - shrinkP + 1) - maxFreq > k){
                window.put(s.charAt(shrinkP), window.getOrDefault(s.charAt(shrinkP), 0) - 1);
                shrinkP++;
            }

            longestSubStr = Math.max(longestSubStr, expandingP - shrinkP + 1); //why +1 again? I know it's part of the formula but how?

        }
        return longestSubStr;
    }
}
