class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        
        for(int i = 0; i < tokens.length; i++ ){
            String token = tokens[i];
            if( token.equals("*") ) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                sum = num1 * num2;
            }
            else if( token.equals("/")){
                sum /= stack.pop();
            }
            else if( token.equals("+")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                sum = num1 + num2;
                stack.push(sum);
            }
            else if( token.equals("-")){
                sum -= stack.pop();
            }
            else{
                int num = Integer.parseInt(token);
                stack.push(num);
            }
        }
        return sum;
    }
}
