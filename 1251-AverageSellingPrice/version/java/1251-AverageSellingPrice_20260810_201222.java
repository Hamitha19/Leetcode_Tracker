// Last updated: 8/10/2026, 8:12:22 PM
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int []ans=new int[nums.length];
4        for(int i=0;i<nums.length;i++){
5            int count=0;
6            for(int j=0;j<nums.length;j++){
7                if(nums[i]>nums[j]){
8                    count++;
9                }
10            }
11            ans[i]=count;
12        }
13        return ans;
14    }
15}