class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> str1_window = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            str1_window.put(c, str1_window.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> str2_window = new HashMap<>();
        int l = 0;
        for(int r = 0; r < s2.length(); r++){
            char c = s2.charAt(r);
            str2_window.put(c, str2_window.getOrDefault(c, 0) + 1);

            while( (r - l + 1) > s1.length()){
                char lC = s2.charAt(l);
                str2_window.put(lC, str2_window.get(lC) - 1);
                if(str2_window.get(lC) == 0){
                    str2_window.remove(lC);
                }
                l++;
            }
            if(str2_window.equals(str1_window)){
                return true;
            }
        }
        return false;
    }
}
