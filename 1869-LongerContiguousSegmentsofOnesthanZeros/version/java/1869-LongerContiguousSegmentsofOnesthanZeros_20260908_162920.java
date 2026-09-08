// Last updated: 9/8/2026, 4:29:20 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int []arr=new int[nums.length+nums.length];
4        int j=0;
5        for(int i=0;i<nums.length;i++){
6            arr[j++]=nums[i];
7        }
8        for(int i=0;i<nums.length;i++){
9            arr[j++]=nums[i];
10        }
11        return arr;
12
13    }
14}