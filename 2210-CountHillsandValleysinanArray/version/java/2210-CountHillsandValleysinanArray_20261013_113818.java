// Last updated: 10/13/2026, 11:38:18 AM
1class Solution {
2    public int countHillValley(int[] nums) {
3      int count=0;
4      for(int i=1;i<nums.length-1;i++){
5        if(nums[i]==nums[i-1]){
6            continue;
7        }
8        int left=i-1;
9        int right=i+1;
10        while(left>=0 && nums[left]==nums[i]){
11            left--;
12        }
13        while(right<nums.length && nums[right]==nums[i]){
14            right++;
15        }
16        if(left>=0 && right<nums.length){
17        if(nums[i]>nums[left] && nums[i]>nums[right]){
18            count++;
19        }else if(nums[i]<nums[left] && nums[i]<nums[right]){
20            count++;
21        }
22        }
23      }
24      return count;
25    }
26}