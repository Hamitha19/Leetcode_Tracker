// Last updated: 10/13/2026, 12:29:08 PM
1class Solution {
2    public int findClosestNumber(int[] nums) {
3        int close=nums[0];
4        
5        for(int i=1;i<nums.length;i++){
6            if(Math.abs(nums[i])<Math.abs(close)){
7                close=nums[i];
8            }else if(Math.abs(nums[i])==Math.abs(close)){
9                if(nums[i]>close){
10                    close=nums[i];
11                }
12            }
13        }
14        return close;
15    }
16}