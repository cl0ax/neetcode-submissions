class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new DequeArray<>();
        int sum = 0;

        for(int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            // if op
            if( token.equals("*") ){
                int a = stack.pop();
                int b = stack.pop();
                sum = a * b;
                stack.push(sum);
            }
            else if( token.equals("/") ){
                int a = stack.pop();
                int b = stack.pop();
                sum = a * b;
                stack.push(sum);
            }
            else if( token.equals("+") ){
                int a = stack.pop();
                int b = stack.pop();
                sum = a * b;
                stack.push(sum);
            }
            else if( token.equals("-") ){
                int a = stack.pop();
                int b = stack.pop();
                sum = a * b;
                stack.push(sum);
            }
            else{ //is number to push onto stack
                int num = Integer.parseInt(token);
                stack.push(num);
            }
        }
        return sum;
    }
}
