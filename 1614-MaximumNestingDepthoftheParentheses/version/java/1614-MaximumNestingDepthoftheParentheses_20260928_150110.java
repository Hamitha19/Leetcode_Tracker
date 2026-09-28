// Last updated: 9/28/2026, 3:01:10 PM
1class Solution {
2    public int maxDepth(String s) {
3        int count=0;
4        int max=0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)=='('){
7                count++;
8                if(count>max){
9                    max=count;
10                }
11            }else if(s.charAt(i)==')'){
12                count--;
13            }
14        }
15        return max;
16    }
17}