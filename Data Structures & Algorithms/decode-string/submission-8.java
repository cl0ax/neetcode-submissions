class Solution {
    public String decodeString(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        String decoded_str = "";
        int i = 0;
        int times = 1;

        // while( i < s.length() ){

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if( Character.isLetter(c) ) {
                String letter = Character.toString(c);
                stack.push(c);
            }

            else if ( Character.isDigit(c)) {
                times = Character.getNumericValue(c);
                stack.push(c);
                
            }

            if( c == ']') {
                char popped = stack.pop();
                if( popped == '[') {
                    decoded_str += 
                }
            }
        }
        // i++;
        //}
        return decoded_str;
    }
}