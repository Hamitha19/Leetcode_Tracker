// Last updated: 7/31/2026, 12:09:40 PM
1class Solution {
2    public String removeDuplicates(String s) {
3        Stack<Character> st=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            if(!st.empty() && st.peek()==s.charAt(i)){
6                st.pop();
7            }else {
8                st.push(s.charAt(i));
9            }
10        }
11        StringBuilder sb=new StringBuilder();
12        while(!st.empty()){
13            sb.append(st.pop());
14        }
15        sb.reverse();
16        return sb.toString();
17    }
18}