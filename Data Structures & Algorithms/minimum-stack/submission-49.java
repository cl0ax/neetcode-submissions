class MinStack {

    private Deque<Integer> stack = new ArrayDeque<>();
    private Deque<Integer> minStack = new ArrayDeque<>();

    public MinStack() { //constructor
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if( !stack.isEmpty() || val >= stack.peek() ) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        int popped = stack.pop();
        if( popped == minStack.peek() ) {
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
