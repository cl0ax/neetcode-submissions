class Solution {
    public String decodeString(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        String decoded_str = "";
        int i = 0;
        int times = 1;

        while( i < s.length() ){

            for(int j = i + 1; j < s.length(); j++ ) {
                char c = s.charAt(j);

                if( Character.isDigit(c) ) {
                    
                }
            }
            i++;
        }
        return decoded_str;
    }
}