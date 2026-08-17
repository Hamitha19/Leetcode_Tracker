// Last updated: 8/17/2026, 3:04:14 PM
1class Solution {
2    public int maxScore(String s) {
3        int ones=0;
4        for(char ch:s.toCharArray()){
5            if(ch=='1'){
6                ones++;
7            }
8        }
9        int zero=0,max=0;
10        for(int i=0;i<s.length()-1;i++){
11            if(s.charAt(i)=='0'){
12                zero++;
13            }else{
14                ones--;
15            }
16            max=Math.max(max,zero+ones);
17        }
18        return max;
19    }
20}