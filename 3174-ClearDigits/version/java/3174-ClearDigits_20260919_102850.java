// Last updated: 9/19/2026, 10:28:50 AM
1class Solution {
2    public String clearDigits(String s) {
3        Stack<Character> stack=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(Character.isLetter(ch)){
7                stack.push(ch);
8            }else{
9                stack.pop();
10            }
11        }
12        String res="";
13        for(char ch:stack){
14            res+=ch;
15        }
16        return res;
17    }
18}