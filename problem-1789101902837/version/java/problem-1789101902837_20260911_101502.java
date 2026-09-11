// Last updated: 9/11/2026, 10:15:02 AM
1class Solution {
2    public int findMiddleIndex(int[] nums) {
3        int tot=0;
4        int left=0;
5        for(int i=0;i<nums.length;i++) tot+=nums[i];
6        for(int i=0;i<nums.length;i++){
7            if(left*2==tot-nums[i]){
8                return i;
9            }
10            left+=nums[i];
11        }
12        return -1;
13    }
14}