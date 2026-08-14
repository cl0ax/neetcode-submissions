class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int longestSubstring = 0;
        Set<Character> window = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            while(window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);
            longestSubstring = Math.max(longestSubstring, right - left + 1);
        }
        return longestSubstring;
    }
}
