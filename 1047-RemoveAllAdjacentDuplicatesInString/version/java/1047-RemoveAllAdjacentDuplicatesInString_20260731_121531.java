// Last updated: 7/31/2026, 12:15:31 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3        int n=heights.length;
4        int []arr=new int[n];
5        for(int i=0;i<n;i++){
6            arr[i]=heights[i];
7        }
8        Arrays.sort(arr);
9        int count=0;
10        for(int i=0;i<n;i++){
11            if(arr[i]!=heights[i]){
12                count++;
13            }
14        }
15        return count;
16    }
17}