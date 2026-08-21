class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if ( c == '(' || c == '{' || c == '[' ){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if ( c == ')' || c == '}' || c == ']'){
                    char open = stack.pop();
                    if( open == '(' && c == ')'){
                        return true;
                    }
                    else if( open == '{' && c == '}'){
                        return true;
                    }
                    else if( open == '[' && c == ']'){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
