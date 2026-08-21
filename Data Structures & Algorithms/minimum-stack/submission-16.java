class MinStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();


    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        minStack.push(val);
    }
    
    public void pop() {
        int popped = stack.pop();
        // if(!minStack.isEmpty()){
        //     minStack.pop();
        // }
        if(minStack.peek() == popped){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
