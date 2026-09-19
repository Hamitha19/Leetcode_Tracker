// Last updated: 9/19/2026, 11:04:45 AM
1class Solution {
2    public int minLength(String s) {
3        Stack<Character> stack=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(!stack.isEmpty()){
7            char top=stack.peek();
8            if(ch=='B' && top=='A' ||ch=='D' && top=='C'){
9                stack.pop();
10            }
11            else{
12                stack.push(ch);
13            }
14        }else{
15            stack.push(ch);
16        }
17        }
18        return stack.size();
19    }
20}