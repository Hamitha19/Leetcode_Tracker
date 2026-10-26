// Last updated: 10/26/2026, 9:18:02 AM
1class Solution {
2    public int percentageLetter(String s, char letter) {
3        int count=0;
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)==letter){
6                count++;
7            }
8        }
9        int tot=count*100/s.length();
10        return tot;
11    }
12}