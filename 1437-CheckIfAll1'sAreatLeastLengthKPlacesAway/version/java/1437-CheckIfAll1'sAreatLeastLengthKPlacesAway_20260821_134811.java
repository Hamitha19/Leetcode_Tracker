// Last updated: 8/21/2026, 1:48:11 PM
1class Solution {
2    public boolean kLengthApart(int[] nums, int k) {
3        int count=-1;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==1){
6               if(count!=-1 && i-count-1<k){
7                return false;
8               }
9               count=i;
10            }
11        }
12        return true;
13    }
14}