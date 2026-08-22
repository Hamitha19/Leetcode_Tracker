// Last updated: 8/22/2026, 1:49:47 PM
1class Solution {
2    public String thousandSeparator(int n) {
3        StringBuilder sb=new StringBuilder();
4        String s=String.valueOf(n);
5        int count=0;
6        for(int i=s.length()-1;i>=0;i--){
7            sb.append(s.charAt(i));
8            count++;
9            if(count==3 && i!=0){
10                sb.append('.');
11                count=0;
12            }
13        }
14        return sb.reverse().toString();
15    }
16}