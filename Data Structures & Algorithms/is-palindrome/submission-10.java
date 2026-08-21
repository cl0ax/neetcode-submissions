class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char c_left = s.charAt(left);
            char c_right = s.charAt(right);
            if(Character.toLowerCase(c_left) != Character.toLowerCase(c_right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
