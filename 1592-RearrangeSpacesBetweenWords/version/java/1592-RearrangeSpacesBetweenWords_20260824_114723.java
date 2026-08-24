// Last updated: 8/24/2026, 11:47:23 AM
1class Solution {
2    public int specialArray(int[] nums) {
3        for(int i=1;i<=nums.length;i++){
4            int count=0;
5            for(int j=0;j<nums.length;j++){
6                if(nums[j]>=i){
7                    count++;
8                }
9            }
10            if(count==i){
11                return i;
12            }
13        }
14        return -1;
15    }
16}