class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> count = new HashMap<>();
        int left = 0; //expanding pointer
        int maxFreq = 0; //the most frequent Char count
        int longestSubStr = 0;

        Set<Character> window = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            count.put(c, count.getOrDefault(c, 0) + 1);

            maxFreq = Math.max(maxFreq, count.get(c));

            while( (right - left + 1) - maxFreq > k ){
                count.put(s.charAt(left), count.getOrDefault(s.charAt(left), 0) - 1);
                left++;
            }
            longestSubStr = Math.max(longestSubStr, right - left + 1);
        }
        return longestSubStr;
    }
}