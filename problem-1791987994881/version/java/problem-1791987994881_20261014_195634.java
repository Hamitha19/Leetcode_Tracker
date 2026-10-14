// Last updated: 10/14/2026, 7:56:34 PM
1class Solution {
2    public String digitSum(String s, int k) {
3        while(s.length()>k){
4            String news="";
5            for(int i=0;i<s.length();i+=k){
6                int dig=0;
7                int end=Math.min(i+k,s.length());
8                for(int j=i;j<end;j++){
9                    dig+=s.charAt(j)-'0';
10                }
11                news+=dig;
12            }
13            s=news;
14        }
15        return s;
16    }
17}