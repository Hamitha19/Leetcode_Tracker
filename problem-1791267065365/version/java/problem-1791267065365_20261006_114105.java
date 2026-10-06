// Last updated: 10/6/2026, 11:41:05 AM
1class Solution {
2    public boolean divideArray(int[] nums) {
3        int []count=new int[501];
4        for(int i=0;i<nums.length;i++){
5            count[nums[i]]++;
6        }
7        for(int i=1;i<501;i++){
8            if(count[i]%2!=0){
9                return false;
10            }
11        }
12        return true;
13    }
14}