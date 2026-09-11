// Last updated: 9/11/2026, 10:03:19 AM
1class Solution {
2    public int findGCD(int[] nums) {
3        Arrays.sort(nums);
4        int min=nums[0];
5        int max=nums[nums.length-1];
6        while(max!=0){
7            int temp=min%max;
8            min=max;
9            max=temp;
10        }
11        return min;
12    }
13}