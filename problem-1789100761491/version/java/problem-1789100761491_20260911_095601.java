// Last updated: 9/11/2026, 9:56:01 AM
1class Solution {
2    public boolean isPrefixString(String s, String[] words) {
3        String str="";
4        for(String t:words){
5            str+=t;
6            if(str.equals(s)){
7            return true;
8        }
9        }
10        return false;
11    }
12}