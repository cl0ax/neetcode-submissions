class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> count = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
        }
        

        Set<Character> window = new HashSet<>();
        int left = 0;
        int longestSubStr = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            while(window.size() <= k){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);
            left++;
            longestSubStr = Math.max(longestSubStr, right - left + 1);
        }

        System.out.println(window);
        return longestSubStr;
    }
}