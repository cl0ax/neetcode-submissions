class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        
        while ( left < right ) {
            if( !Character.isLetter(s.charAt(left)) ) {
                left++;
            }
            else if( !Character.isLetter(s.charAt(right)) ) {
                right--;
            }
            else if( s.charAt(left) != s.charAt(right) ) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
