// Last updated: 9/2/2026, 4:20:56 PM
1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int min=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            if(target==nums[i]){
6                int d=Math.abs(i-start);
7                min=Math.min(min,d);
8            }
9        }
10        return min;
11    }
12}