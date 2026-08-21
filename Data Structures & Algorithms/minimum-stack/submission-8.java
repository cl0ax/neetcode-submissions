class MinStack {

    private Deque<Integer> stack; 
    private Deque<Integer> minStack;
    private int minElement = Integer.MAX_VALUE ;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
        minElement = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stack.push(val);
        if( minStack.isEmpty() || val <= minStack.peek()){
            minElement = val;
            minStack.push(minElement);
        }
        
    }
    
    public void pop() {
        if(stack.pop() == minStack.peek()){
            minStack.pop();
        }
        
    }
    
    public int top() {
        
        int top = stack.peek();
        return top;
    }
    
    public int getMin() {
        
        return minStack.peek();
    }
}
