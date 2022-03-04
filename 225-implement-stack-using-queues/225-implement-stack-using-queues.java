class MyStack {

    Queue<Integer> q;
    
    public MyStack() {
        q = new LinkedList<Integer>();    
    }
    
    public void push(int x) {
        q.add(x);
         // pop and add back to queue till size-1
        // i.e rotate the queue
        int n = q.size();
        for(int i=0;i<n-1;i++){
            int temp = q.poll();
            q.add(temp);
        }
    }
    
    public int pop() {
       
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */