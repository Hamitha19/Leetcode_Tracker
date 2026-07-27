// Last updated: 7/27/2026, 11:21:18 AM
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3        int count=0;
4        for(int i=0;i<nums.length-1;i++){
5            if(nums[i+1]<nums[i]){
6                count++;
7            
8            if(count>1){
9                return false;
10            }
11            if(i==0 || nums[i-1]<=nums[i+1]){
12                nums[i]=nums[i+1];
13            }else{
14                nums[i+1]=nums[i];
15            }
16        }
17        }
18        return true;
19    }
20}