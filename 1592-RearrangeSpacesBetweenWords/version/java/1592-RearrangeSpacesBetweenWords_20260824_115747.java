// Last updated: 8/24/2026, 11:57:47 AM
1class Solution {
2    public double trimMean(int[] arr) {
3        Arrays.sort(arr);
4        int remove=arr.length/20;
5        int sum=0;
6        int count=0;
7        for(int i=remove;i<arr.length-remove;i++){
8            sum+=arr[i];
9            count++;
10        }
11        return (double)sum/count;
12    }
13}