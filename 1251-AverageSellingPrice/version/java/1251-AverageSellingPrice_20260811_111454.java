// Last updated: 8/11/2026, 11:14:54 AM
1class Solution {
2    public int[] sumZero(int n) {
3        int []arr=new int[n];
4        int index=0;
5        for(int i=1;i<=n/2;i++){
6            arr[index++]=-i;
7            arr[index++]=i;
8        }
9        if(n%2!=0){
10            arr[index]=0;
11        }
12        return arr;
13    }
14}