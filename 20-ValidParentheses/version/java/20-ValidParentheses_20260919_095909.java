// Last updated: 9/19/2026, 9:59:09 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character>stack=new Stack<Character>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(ch=='(' || ch=='{' || ch=='['){
7                stack.push(ch);
8            }else{
9                if(stack.isEmpty()){
10                    return false;
11                }
12                char top=stack.pop();
13                if(ch==')' && top!='('){
14                    return false;
15                }
16                if(ch=='}' && top!='{'){
17                    return false;
18                }
19                if(ch==']' && top!='['){
20                    return false;
21                }
22            }
23        }
24        return stack.isEmpty();
25        }
26}