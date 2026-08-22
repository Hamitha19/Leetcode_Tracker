// Last updated: 8/22/2026, 11:17:56 AM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int a=n;
4        int d=0;
5        while(a>0){
6            int temp=a%10;
7            d+=temp;
8            a/=10;
9        }
10        a=n;
11        int prod=1;
12        while(a>0){
13            int temp=a%10;
14            prod*=temp;
15            a/=10;
16        }
17        int sum=d+prod;
18        if(n%sum==0){
19            return true;
20        }
21        return false;
22
23    }
24}