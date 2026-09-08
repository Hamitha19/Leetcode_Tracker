// Last updated: 9/8/2026, 4:24:51 PM
1class Solution {
2    public int maxProductDifference(int[] nums) {
3        Arrays.sort(nums);
4            int min=nums[0]*nums[1];
5            int max=nums[nums.length-2]*nums[nums.length-1];
6            return max-min;
7        
8    }
9}