class MinStack {

    /*
    Object Oritented Programming Design
    Concept: encapsulation

    */
    //Setting private variables so the user wouldn't have access to them 
    private Deque<Integer> stack; 
    private Deque<Integer> minStack;


   // constructor 
    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    //Setter. 
    public void push(int val) {
        stack.push(val);
        if( minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        
    }
    //Setter. 
    public void pop() {
        int popped = stack.pop();
        if(popped == minStack.peek()){
            minStack.pop();
        }
        
    }
    //Getter
    public int top() {
        
        int top = stack.peek();
        return top;
    }
    //getter
    public int getMin() {
        
        return minStack.peek();
    }
}
