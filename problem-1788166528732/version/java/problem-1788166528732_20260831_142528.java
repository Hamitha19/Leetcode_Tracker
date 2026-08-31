// Last updated: 8/31/2026, 2:25:28 PM
1class Solution {
2    public int getMaximumGenerated(int n) {
3        if(n==0){
4            return 0;
5        }
6        int []arr=new int[n+1];
7        arr[0]=0;
8        arr[1]=1;
9        for(int i=1;i<=n/2;i++){
10            if(2*i<=n){
11                arr[2*i]=arr[i];
12            }
13            if(2*i+1<=n){
14                arr[2*i+1]=arr[i]+arr[i+1];
15            }
16        }
17        int max=0;
18        for(int i=0;i<=n;i++){
19            max=Math.max(max,arr[i]);
20        }
21        return max;
22
23    }
24}