// Last updated: 8/14/2026, 4:03:56 PM
1class Solution {
2    public int findLucky(int[] arr) {
3        int ans=-1;
4        for(int i=0;i<arr.length;i++){
5            int count=0;
6            for(int j=0;j<arr.length;j++){
7                if(arr[i]==arr[j]){
8                    count++;
9                }
10            }
11            if(count==arr[i]){
12                ans=Math.max(ans,arr[i]);
13            }
14        }
15        return ans;
16    }
17}