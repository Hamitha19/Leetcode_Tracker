// Last updated: 8/10/2026, 7:51:49 PM
1class Solution {
2    public int[] replaceElements(int[] arr) {
3        int max=-1;
4        for(int i=arr.length-1;i>=0;i--){
5            int current=arr[i];
6            arr[i]=max;
7            max=Math.max(max,current);
8        }
9        return arr;
10    }
11}