class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int l = 0;
        int longestSubStr = 0;
        for(int r = 0; r < s.length(); r++){
            //char c = s.charAt(r);
            while(window.contains(s.charAt(r))){
                window.remove(s.charAt(l));
                l++;
            }
            window.add(s.charAt(r));
            longestSubStr = Math.max(longestSubStr, r - l + 1);
        }
        return longestSubStr;
    }
}
