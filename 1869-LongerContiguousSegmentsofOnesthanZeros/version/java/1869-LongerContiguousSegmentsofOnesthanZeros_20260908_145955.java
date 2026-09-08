// Last updated: 9/8/2026, 2:59:55 PM
1class Solution {
2    public int countGoodSubstrings(String s) {
3       int count=0;
4       for(int i=0;i<=s.length()-3;i++){
5        String st=s.substring(i,i+3);
6        if(st.charAt(0)!=st.charAt(1) && st.charAt(1)!=st.charAt(2) && st.charAt(2)!=st.charAt(0)){
7            count++;
8        }
9       } 
10       return count;
11    }
12}