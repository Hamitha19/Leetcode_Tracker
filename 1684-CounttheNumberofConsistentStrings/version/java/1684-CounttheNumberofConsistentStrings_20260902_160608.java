// Last updated: 9/2/2026, 4:06:08 PM
1class Solution {
2    public String truncateSentence(String s, int k) {
3        String []str=s.split(" ");
4        String t="";
5        for(int i=0;i<k;i++){
6            t+=str[i];
7            if(i!=k-1){
8            t+=" ";
9            }
10        }
11        return t;
12    }
13}