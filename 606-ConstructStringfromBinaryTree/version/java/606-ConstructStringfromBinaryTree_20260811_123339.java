// Last updated: 8/11/2026, 12:33:39 PM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> stack=new Stack<>();
4        int num=0;
5        char sign='+';
6        for(int i=0;i<s.length();i++){
7            if(Character.isDigit(s.charAt(i))){
8                num=num*10+(s.charAt(i)-'0');
9            }
10            if((!Character.isDigit(s.charAt(i)) && s.charAt(i)!=' ')|| i==s.length()-1){
11                if(sign=='+'){
12                    stack.push(num);
13                }else if(sign=='-'){
14                    stack.push(-num);
15                }else if(sign=='*'){
16                    stack.push(stack.pop()*num);
17                }else if(sign=='/'){
18                    stack.push(stack.pop()/num);
19                }
20                sign=s.charAt(i);
21                num=0;
22            }
23        }
24        int res=0;
25        for(int x:stack){
26            res+=x;
27        }
28        return res;
29    }
30}