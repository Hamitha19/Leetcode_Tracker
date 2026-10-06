// Last updated: 10/6/2026, 11:26:32 AM
1class Solution {
2    public int mostFrequent(int[] nums, int key) {
3        int []count=new int[1001];
4        int max=0;
5        int ans=0;
6        for(int i=0;i<nums.length-1;i++){
7            if(nums[i]==key){
8                count[nums[i+1]]++;
9                if(count[nums[i+1]]>max){
10                    max=count[nums[i+1]];
11                    ans=nums[i+1];
12                }
13            }
14        }
15        return ans;
16    }
17}