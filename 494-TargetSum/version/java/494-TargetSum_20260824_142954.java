// Last updated: 8/24/2026, 2:29:54 PM
1class Solution {
2    public int sumOfUnique(int[] nums) {
3        int []freq=new int[101];
4        for(int i=0;i<nums.length;i++){
5            freq[nums[i]]++;
6        }
7        int sum=0;
8        for(int i=0;i<=100;i++){
9            if(freq[i]==1){
10                sum+=i;
11            }
12        }
13        return sum;
14    }
15}