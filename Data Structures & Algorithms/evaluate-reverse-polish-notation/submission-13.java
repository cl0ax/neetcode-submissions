class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        
        for(int i = 0; i < tokens.length; i++ ){
            String token = tokens[i];
            if( token == "+" ) {
                sum += stack.pop();
            }
            else if( token == "-"){
                sum -= stack.pop();
            }
            else if( token == "/"){
                sum /= stack.pop();
            }
            else if( token == "*"){
                sum *= stack.pop();
            }
            else{
                int num = Integer.parseInt(token);
                stack.push(num);
            }
        }
        return sum;
    }
}
