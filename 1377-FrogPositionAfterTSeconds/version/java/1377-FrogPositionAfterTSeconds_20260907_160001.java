// Last updated: 9/7/2026, 4:00:01 PM
1class Solution {
2    public int maxAscendingSum(int[] nums) {
3        int max=nums[0];
4        int sum=nums[0];
5        for(int i=1;i<nums.length;i++){
6            if(nums[i]>nums[i-1]){
7                sum+=nums[i];
8            }else{
9                sum=nums[i];
10            }
11            max=Math.max(max,sum);
12        }
13        return max;
14    }
15}