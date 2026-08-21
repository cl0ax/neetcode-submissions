class MinStack {

    public MinStack() {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> minStack = new ArrayDeque<>();
        int minElement = 0;
    }
    
    public void push(int val) {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> minStack = new ArrayDeque<>();
        int minElement = 0;
        stack.push(val);
        if(val < minElement){
            minElement = val;
            minStack.push(minElement);
        }
    }
    
    public void pop() {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.pop();
    }
    
    public int top() {
        Deque<Integer> stack = new ArrayDeque<>();
        int top = stack.peek();
        return top;
    }
    
    public int getMin() {
        Deque<Integer> minStack = new ArrayDeque<>();
        int minElement = 0;
            minStack.push(minElement);
        if(minStack.peek() < minElement){
            minElement = minStack.peek();
            minStack.push(minElement);
        }
        minElement = minStack.peek();
        return minElement;
    }
}
