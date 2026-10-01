// Last updated: 10/1/2026, 11:09:23 AM
1class Solution {
2    public int findFinalValue(int[] nums, int original) {
3        int n=original;
4        for(int i=0;i<nums.length;i++){
5            for(int j=0;j<nums.length;j++){
6            if(nums[j]==n){
7                n=n*2;
8            }
9            }
10        }
11        return n;
12    }
13}