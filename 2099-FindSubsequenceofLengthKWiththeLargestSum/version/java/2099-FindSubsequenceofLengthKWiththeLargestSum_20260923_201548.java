// Last updated: 9/23/2026, 8:15:48 PM
1class Solution {
2    public int countElements(int[] nums) {
3        int count=0;
4        Arrays.sort(nums);
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]>nums[0] && nums[i]<nums[nums.length-1]){
7                count++;
8            }
9        }
10        
11        return count;
12    }
13}