// Last updated: 8/6/2026, 11:22:37 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int curr=nums[0];
4        int max=nums[0];
5        for(int i=1;i<nums.length;i++){
6            curr=Math.max(nums[i],curr+nums[i]);
7            max=Math.max(max,curr);
8        }
9        return max;
10    }
11}