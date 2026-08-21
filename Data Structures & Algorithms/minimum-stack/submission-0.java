class MinStack {

    public MinStack() {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> minStack = new ArrayDeque<>();
        int minElement = 0;
    }
    
    public void push(int val) {
        stack.push(val);
        if(val < minElement){
            minElement = val;
            minStack.push(minElement);
        }
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
