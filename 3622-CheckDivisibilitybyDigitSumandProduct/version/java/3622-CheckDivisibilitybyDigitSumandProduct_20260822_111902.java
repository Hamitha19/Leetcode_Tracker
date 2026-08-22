// Last updated: 8/22/2026, 11:19:02 AM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int a=n;
4        int prod=1;
5        int d=0;
6        while(a>0){
7            int temp=a%10;
8            d+=temp;
9            prod*=temp;
10            a/=10;
11        }
12        int sum=d+prod;
13        if(n%sum==0){
14            return true;
15        }
16        return false;
17    }
18}