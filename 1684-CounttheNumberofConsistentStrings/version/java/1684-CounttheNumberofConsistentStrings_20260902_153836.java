// Last updated: 9/2/2026, 3:38:36 PM
1class Solution {
2    public boolean checkOnesSegment(String s) {
3        boolean found=false;
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='0'){
6                found=true;
7            }
8            if(s.charAt(i)=='1' && found){
9                return false;
10            }
11        }
12        return true;
13    }
14}