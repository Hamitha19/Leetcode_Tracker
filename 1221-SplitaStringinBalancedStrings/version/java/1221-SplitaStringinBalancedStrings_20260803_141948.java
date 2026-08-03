// Last updated: 8/3/2026, 2:19:48 PM
1class Solution {
2    public int balancedStringSplit(String s) {
3        int count=0;
4        int balance=0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)=='R'){
7                balance++;
8            }else{
9                balance--;
10            }
11            if(balance==0){
12                count++;
13            }
14        }
15        return count;
16    }
17}