class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        
        for(int i = 0; i < tokens.length; i++ ){
            String token = tokens[i];
            while( token.equals("*") && !stack.isEmpty() ) {
                
                sum *= stack.pop();
                stack.push(sum);
            }
            while( token.equals("/") && !stack.isEmpty() ) {
                sum /= stack.pop();
                stack.push(sum);
            }
            while( token.equals("+") && !stack.isEmpty() ) {
                sum += stack.pop();
                stack.push(sum);
            }
            while( token.equals("-") && !stack.isEmpty() ) {
                sum -= stack.pop();
                stack.push(sum);
            }
            else{
                int num = Integer.parseInt(token);
                stack.push(num);
            }
        }
        return sum;
    }
}
