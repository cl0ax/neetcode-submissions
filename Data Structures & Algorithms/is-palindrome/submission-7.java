class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char c_left = s.charAt(left);
            char c_right = s.charAt(right);
            if(Character.toLowerCase(c_left) == Character.toLowerCase(c_right)){
                return true;
            }
        }
        return false;
    }
}
