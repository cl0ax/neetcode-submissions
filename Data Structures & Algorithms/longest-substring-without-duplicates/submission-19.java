class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int n = s.length();
        int longestRunning = 0;

        Set<Character> window = new HashSet();

        while (right < n) {
            for (int right = 0; right < n; right++) {
                char c = s.charAt(right);
                while (window.contains(c)) {
                    window.remove(s.charAt(left));
                    left++;
                }
                window.add(c);
                longestRunning = Math.max(longestRunning, right - left + 1);
            }
        }
        return longestRunning;
    }
}
