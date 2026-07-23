// Last updated: 7/23/2026, 2:17:23 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int sum=0;
4        for(int i=0;i<nums.length;i++){
5            sum+=nums[i];
6        }
7        int left=0;
8        for(int i=0;i<nums.length;i++){
9            int right=sum-left-nums[i];
10            if(left==right){
11                return i;
12            }
13            left+=nums[i];
14        }
15        return -1;
16    }
17}