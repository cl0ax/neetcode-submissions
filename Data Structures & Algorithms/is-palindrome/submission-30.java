class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while ( left < right ) {
            char l_char = s.charAt(left);
            char r_char = s.charAt(right);
            
            if( !Character.isLetterOrDigit(l_char) ) {
                left++;
            }
            else if( !Character.isLetterOrDigit(r_char) ) {
                right--;
            }
            else if( Character.toLowerCase(l_char) != Character.toLowerCase(r_char)) { 
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
