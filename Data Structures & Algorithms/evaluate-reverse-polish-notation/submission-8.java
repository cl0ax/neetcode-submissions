class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Character> stack = new ArrayDeque<>();
        int sum = 0;
        char[] c_Tokens = Arrays.toCharArray(tokens);
        int i = 0;
        for(char token : tokens.charAt(i) ){
            if( token.isDigit() ){ //it's a number
                stack.push(token);
            }
            else{ //it's an operation
                char operator = token; 
                if(operator == "+"){
                    sum = stack.pop();
                }
            }
            i++;
        }

    }
}
