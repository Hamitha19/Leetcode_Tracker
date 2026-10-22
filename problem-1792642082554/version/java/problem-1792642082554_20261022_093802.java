// Last updated: 10/22/2026, 9:38:02 AM
1class Solution {
2    public int divisorSubstrings(int num, int k) {
3        String s=String.valueOf(num);
4        int count=0;
5        for(int i=0;i<=s.length()-k;i++){
6            String sub=s.substring(i,i+k);
7            int n=Integer.parseInt(sub);
8            if(n!=0 && num%n==0){
9                count++;
10            }
11        }
12        return count;
13    }
14}