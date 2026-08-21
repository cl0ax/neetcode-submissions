class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char[] sArr = s.toCharArray();
        boolean flag = false;
        for(char c : sArr){
            stack.push(c);
        }

        for (int i = 0; i < s.length(); i++){
            char c = sArr[i];
            if( c == '(' && stack.peek() == ')' ){
                stack.pop();
                flag = true;
            }
            else if( c == '{' && stack.peek() == '}' ){
                stack.pop();
                flag = true;
            }
            else if( c == '[' && stack.peek() == ']' ){
                stack.pop();
                flag = true;
            }
        }
        return flag;
    }
}
