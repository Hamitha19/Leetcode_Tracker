// Last updated: 7/23/2026, 1:57:44 PM
1class Solution {
2    public int findNumbers(int[] nums) {
3        int count=0;
4        for(int i=0;i<nums.length;i++){
5            int n=nums[i];
6            int d=0;
7            while(n>0){
8                d++;
9                n/=10;
10            }
11            if(d%2==0){
12                count++;
13            }
14        }
15        return count;
16    }
17}