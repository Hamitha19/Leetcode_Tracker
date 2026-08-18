// Last updated: 8/18/2026, 11:35:18 AM
1class Solution {
2    public int maxPower(String s) {
3        int max=1;
4        int count=1;
5        for(int i=1;i<s.length();i++){
6            
7                if(s.charAt(i)==s.charAt(i-1)){
8                    count++;
9                }else{
10                    count=1;
11                }
12            
13            max=Math.max(max,count);
14        }
15        return max;
16    }
17}