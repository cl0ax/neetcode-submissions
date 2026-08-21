class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Character> stack = new ArrayDeque<>();
        int sum = 0;
        char[] c_Tokens = tokens.toCharArray();

        for(int i = 0; i < c_Tokens.length; i++){
            char token = c_Tokens[i];
            if( token.isDigit() ){ //it's a number
                stack.push(token);
            }
            else{ //it's an operation
                char operator = token; 
                if(operator == "+"){
                    sum = stack.pop();
                }
            }
        }

    }
}
