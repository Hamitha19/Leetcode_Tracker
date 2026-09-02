// Last updated: 9/2/2026, 2:16:04 PM
1class Solution {
2    public int totalMoney(int n) {
3        int sum=0;
4        int m=1;
5        int i=0;
6        while(i<n){
7            for(int j=m;j<m+7 && i<n;j++){
8                sum+=j;
9                i++;
10            }
11            m++;
12        }
13        return sum;
14    }
15}