class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( c == '(' || c == '{' || c == '['){
                stack.push(c); 
                //stack: [   [,    ]
            }
            else{
                if(stack.isEmpty()){
                        return false;
                    }
                if(c == ')' || c == '}' || c == ']' ){
                    char opener = stack.pop();
                    
                    if( opener == '(' && c != ')'){
                        return false;
                    }
                    else if( opener == '{' && c != '}'){
                        return false;
                    }
                    else if( opener == '[' && c != ']'){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty(); 
    }
}
