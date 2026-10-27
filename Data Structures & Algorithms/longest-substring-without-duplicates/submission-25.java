class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int longestSubStr = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            while(window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);
            longestSubStr = Math.max(longestSubStr, right - left + 1); //what is the +1 doing here?
        }
        System.out.println(window);
        return longestSubStr;
    }
}
