// Last updated: 11/12/2026, 11:16:16 AM
1class Solution {
2    public int[] numberOfPairs(int[] nums) {
3        int []freq=new int[101];
4        for(int i=0;i<nums.length;i++){
5            freq[nums[i]]++;
6        }
7        int a=0;
8        int b=0;
9        for(int i=0;i<freq.length;i++){
10                a+=freq[i]/2;
11                b+=freq[i]%2;
12        }
13        return new int[]{a,b};
14    }
15}