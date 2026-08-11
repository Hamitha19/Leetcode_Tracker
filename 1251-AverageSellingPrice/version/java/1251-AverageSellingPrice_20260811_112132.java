// Last updated: 8/11/2026, 11:21:32 AM
1class Solution {
2    public int removePalindromeSub(String s) {
3        String rev="";
4        for(int i=s.length()-1;i>=0;i--){
5            rev=rev+s.charAt(i);
6        }
7        if(s.equals(rev)){
8            return 1;
9        }
10        return 2;
11    }
12}