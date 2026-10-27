class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int n = s.length();
        int longestRunning = 0;

        Set<Character> window = new HashSet();

        while (right < n) {
            char rightChar = s.charAt(right);
            if (!window.contains(leftChar)) {
                window.add(leftChar);
                longestRunning = Math.max(longestRunning, window.size());
            }



            if (!window.contains(rightChar)) {
                window.add(rightChar);
                right++;
            } else {
                
                while (window.contains(rightChar)) {
                    window.remove(leftChar);
                    left++;
                }
            }
        }
        return longestRunning;
    }
}
