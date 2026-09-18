// Last updated: 9/18/2026, 11:56:45 AM
1class Solution {
2    public boolean checkString(String s) {
3        boolean found=false;
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='b'){
6                found=true;
7            }
8            if(found && s.charAt(i)=='a'){
9                return false;
10            }
11        }
12        return true;
13    }
14}