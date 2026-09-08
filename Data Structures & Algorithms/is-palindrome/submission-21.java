class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        
        for( int right = s.length() - 1; right >= s.length(); right-- ) {
            if( !Character.isLetter(s.charAt(left)) ) {
                left++;
            }
            else if( !Character.isLetter(s.charAt(right)) ) {
                right--;
            }
            else if( s.charAt(left) != s.charAt(right) ) {
                return false;
            }
        }
        return true;
    }
}
