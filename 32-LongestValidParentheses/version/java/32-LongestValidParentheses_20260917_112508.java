// Last updated: 9/17/2026, 11:25:08 AM
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> stack=new Stack<>();
4        stack.push(-1);
5        int max=0;
6        for(int i=0;i<s.length();i++){
7            if(s.charAt(i)=='('){
8                stack.push(i);
9            }else{
10                stack.pop();
11            }
12            if(stack.isEmpty()){
13                stack.push(i);
14            }
15            max=Math.max(max,i-stack.peek());
16        }
17        return max;
18    }
19}