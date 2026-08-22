// Last updated: 8/22/2026, 1:59:00 PM
1class Solution {
2    public boolean containsPattern(int[] arr, int m, int k) {
3        int count=0;
4        for(int i=0;i<arr.length-m;i++){
5            if(arr[i]==arr[i+m]){
6                count++;
7            if(count==m*(k-1)){
8                return true;
9            }
10            }else{
11                count=0;
12            }
13            
14        }
15        return false;
16    }
17}