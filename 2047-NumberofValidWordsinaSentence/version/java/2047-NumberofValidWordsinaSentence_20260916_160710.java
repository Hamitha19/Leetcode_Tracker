// Last updated: 9/16/2026, 4:07:10 PM
1class Solution {
2    public int smallestEqual(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        boolean found=false;
5        for(int i=0;i<nums.length;i++){
6            if(i%10==nums[i]){
7                min=Math.min(min,i);
8                found=true;
9            }
10        }
11        if(!found){
12            return -1;
13        }
14        return min;
15    }
16}