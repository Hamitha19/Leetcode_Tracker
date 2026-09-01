// Last updated: 9/1/2026, 12:20:10 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int i=0;
4        for(int j=0;j<t.length();j++){
5            if(i<s.length() && s.charAt(i)==t.charAt(j)){
6                i++;
7            }
8        }
9        return i==s.length();
10    }
11}