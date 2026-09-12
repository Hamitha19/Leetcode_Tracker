// Last updated: 9/12/2026, 11:51:29 AM
1class Solution {
2    public int countKDifference(int[] nums, int k) {
3        int count=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                if(Math.abs(nums[i]-nums[j])==k){
7                    count++;
8                }
9            }
10        }
11        return count;
12    }
13}