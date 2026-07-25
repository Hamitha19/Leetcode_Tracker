// Last updated: 7/25/2026, 1:59:00 PM
1class Solution {
2    public int maxProduct(int n) {
3        int first=0;
4        int second=0;
5        while(n>0){
6            int temp=n%10;
7            if(temp>first){
8                second=first;
9                first=temp;
10            }else if(temp>second){
11                second=temp;
12            }
13            n/=10;
14        }
15        return first*second;
16    }
17}