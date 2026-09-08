// Last updated: 9/8/2026, 2:45:50 PM
1class Solution {
2    public String sortSentence(String s) {
3        String []str=s.split(" ");
4        String ans[]=new String[str.length];
5        for(int i=0;i<str.length;i++){
6           int pos=str[i].charAt(str[i].length()-1)-'0';
7           ans[pos-1]=str[i].substring(0,str[i].length()-1);
8            
9        }
10        return String.join(" ",ans);
11    }
12}