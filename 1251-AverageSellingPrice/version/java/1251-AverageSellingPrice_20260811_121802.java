// Last updated: 8/11/2026, 12:18:02 PM
1class Solution {
2    public String generateTheString(int n) {
3        StringBuilder sb=new StringBuilder();
4        if(n%2==1){
5            for(int i=0;i<n;i++){
6                sb.append('a');
7            }
8        }else{
9            for(int i=0;i<n-1;i++){
10                sb.append('a');
11            }
12            sb.append('b');
13        }
14        return sb.toString();
15    }
16}