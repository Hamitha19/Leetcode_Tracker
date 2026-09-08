// Last updated: 9/8/2026, 3:55:50 PM
1class Solution {
2    public String largestOddNumber(String num) {
3        int max=0;
4        for(int i=num.length()-1;i>=0;i--){
5            if((num.charAt(i)-'0')%2!=0){
6                return num.substring(0,i+1);
7            }
8        }
9        return "";
10    }
11}