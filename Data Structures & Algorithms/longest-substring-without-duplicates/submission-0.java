class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = left + 1;
        int longestSubstring = 0;

        while( right < str.length ){
            Set<Character> substrs = new HashSet<>();
            if(!substrs.contains(str[right])){
                substrs.add(str[right]);
                right++;
            }
            else{
                String subStr = s.substring(left, right);
                longestSubstring = subStr.length();
            }
        }
        return longestSubstring;
    }
}
