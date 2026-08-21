// Last updated: 8/21/2026, 1:59:36 PM
1class Solution {
2    public boolean canMakeArithmeticProgression(int[] arr) {
3        Arrays.sort(arr);
4        int diff=arr[0]-arr[1];
5        for(int i=1;i<arr.length-1;i++){
6            if(arr[i]-arr[i+1]!=diff){
7                return false;
8            }
9
10        }
11        return true;
12    }
13}