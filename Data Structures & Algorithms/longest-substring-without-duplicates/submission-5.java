class Solution {
    public int lengthOfLongestSubstring(String s) {
        //char[] str = s.toCharArray();
        int left = 0;
        int right = left;
        int longestSubstring = 0;
        Set<Character> substrs = new HashSet<>();
        while( right < s.length() ){
            // if(!Character.isLetter(s.charAt(right))){
            //     continue;
            // }
            if(!substrs.contains(s.charAt(right))){
                substrs.add(s.charAt(right));
                right++;
            }
            else{
                String subStr = s.substring(left, right);
                longestSubstring = Math.max(longestSubstring, subStr.length());
                left = right;
                substrs.clear();
            }
        }
        return longestSubstring;
    }
}
