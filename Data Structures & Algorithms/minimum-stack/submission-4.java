class MinStack {

    private Deque<Integer> stack; 
    private Deque<Integer> minStack;
    private int minElement = 1;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
        minElement = 1;
    }
    
    public void push(int val) {
        if(val < minElement){
            minElement = val;
            minStack.push(minElement);
        }
        stack.push(val);
        
    }
    
    public void pop() {
        
        stack.pop();
    }
    
    public int top() {
        
        int top = stack.peek();
        return top;
    }
    
    public int getMin() {
        
        minElement = minStack.peek();
        return minElement;
    }
}
