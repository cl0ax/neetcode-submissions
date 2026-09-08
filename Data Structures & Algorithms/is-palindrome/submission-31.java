class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while ( left < right ) {
            char l_char = s.charAt(left);
            char r_char = s.charAt(right);
            
            while( left < right && !Character.isLetterOrDigit(l_char) ) {
                left++;
            }
            while( left < right && !Character.isLetterOrDigit(r_char) ) {
                right--;
            }
            if( Character.toLowerCase(l_char) != Character.toLowerCase(r_char)) { 
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
