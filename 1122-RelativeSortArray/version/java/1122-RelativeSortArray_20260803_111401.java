// Last updated: 8/3/2026, 11:14:01 AM
1class Solution {
2    public int[] relativeSortArray(int[] arr1, int[] arr2) {
3        int n=arr1.length;
4        int []arr=new int[n];
5        int k=0;
6        boolean []found=new boolean[n];
7        for(int i=0;i<arr2.length;i++){
8            for(int j=0;j<n;j++){
9                if(arr2[i]==arr1[j]){
10                    arr[k++]=arr1[j];
11                    found[j]=true;
12                }
13            }
14        }
15        int []remain=new int[n-k];
16        int x=0;
17        for(int i=0;i<n;i++){
18            if(!found[i]){
19                remain[x++]=arr1[i];
20            }
21        }
22        Arrays.sort(remain);
23        for(int num:remain){
24            arr[k++]=num;
25        }
26        return arr;
27    }
28}