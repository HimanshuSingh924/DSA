class MinStack {
    // HimanshuSingh924

    private Stack<Integer> main;
	private Stack<Integer> min;

    public MinStack() {
        main = new Stack<>();
		min = new Stack<>();
    }
    
    public void push(int val) {
        if (main.size()==0){
			main.push(val);
			min.push(val);
		}
		else{
			main.push(val);
			if (min.peek()>=val) min.push(val);
		}
    }
    
    public void pop() {
        int val = main.pop();
		if (val == min.peek())  min.pop();
    }
    
    public int top() { return main.peek(); }
    
    public int getMin() { return min.peek(); }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */