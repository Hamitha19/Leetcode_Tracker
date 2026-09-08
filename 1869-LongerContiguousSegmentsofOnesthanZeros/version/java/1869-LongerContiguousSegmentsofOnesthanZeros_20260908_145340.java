// Last updated: 9/8/2026, 2:53:40 PM
1class Solution {
2    public boolean checkZeroOnes(String s) {
3        int one=0;
4        int zero=0;
5        int maxO=0;
6        int maxZ=0;
7        for(int i=0;i<s.length();i++){
8            if(s.charAt(i)=='0'){
9                zero++;
10                one=0;
11                maxZ=Math.max(maxZ,zero);
12            }else{
13                one++;
14                zero=0;
15                maxO=Math.max(maxO,one);
16            }  
17        }
18        return maxO>maxZ;
19    }
20}