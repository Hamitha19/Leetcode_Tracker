// Last updated: 9/19/2026, 10:20:04 AM
1class MinStack {
2    Stack<Integer> stack;
3    Stack<Integer> minstack;
4
5    public MinStack() {
6        stack=new Stack<>();
7        minstack=new Stack<>();
8    }
9    
10    public void push(int value) {
11        stack.push(value);
12        if(minstack.isEmpty() || value<=minstack.peek()){
13            minstack.push(value);
14        }
15
16    }
17    
18    public void pop() {
19        int rem=stack.pop();
20        if(rem==minstack.peek()){
21            minstack.pop();
22        }
23    }
24    
25    public int top() {
26        return stack.peek();
27    }
28    
29    public int getMin() {
30        return minstack.peek();
31    }
32}
33
34/**
35 * Your MinStack object will be instantiated and called as such:
36 * MinStack obj = new MinStack();
37 * obj.push(value);
38 * obj.pop();
39 * int param_3 = obj.top();
40 * int param_4 = obj.getMin();
41 */