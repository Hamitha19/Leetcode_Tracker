// Last updated: 8/17/2026, 12:13:21 PM
1class Solution {
2    public int minStartValue(int[] nums) {
3        int sum=0;
4        int minSum=0;
5        for(int i=0;i<nums.length;i++){
6            sum+=nums[i];
7            if(sum<minSum){
8                minSum=sum;
9            }
10        }
11        return 1-minSum;
12    }
13}