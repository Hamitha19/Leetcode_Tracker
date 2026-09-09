// Last updated: 9/9/2026, 7:23:47 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int min=Integer.MAX_VALUE;
4        int sum=0,left=0;
5        for(int i=0;i<nums.length;i++){
6            sum+=nums[i];
7            while(sum>=target){
8                min=Math.min(min,i-left+1);
9                sum-=nums[left];
10                left++;
11            }
12            }
13        
14        if(min==Integer.MAX_VALUE){
15            return 0;
16        }
17        return min;
18    }
19}