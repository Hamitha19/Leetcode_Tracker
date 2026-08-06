// Last updated: 8/6/2026, 2:50:28 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        int num=n;
4        while(true){
5        int prod=1;
6        int temp=num;
7        while(temp>0){
8            prod*=temp%10;
9            temp/=10;
10        }
11        if(prod%t==0){
12                return num;
13        }
14        num++;
15    }
16    }
17}