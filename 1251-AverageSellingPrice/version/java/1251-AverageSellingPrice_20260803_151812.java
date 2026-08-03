// Last updated: 8/3/2026, 3:18:12 PM
1class Solution {
2    public int findSpecialInteger(int[] arr) {
3        int n=arr.length;
4        int p=(int)(n*0.25);
5        int ind=0;
6        for(int i=0;i<n;i++){
7            int count=1;
8            for(int j=i+1;j<n;j++){
9                if(arr[i]==arr[j]){
10                    count++;
11                }
12            }
13            if(count>p){
14                ind=arr[i];
15            }
16        }
17        return ind;
18    }
19}