// Last updated: 9/11/2026, 11:12:22 AM
1class Solution {
2    public int countQuadruplets(int[] nums) {
3        int count=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                for(int k=j+1;k<nums.length;k++){
7                    for(int l=k+1;l<nums.length;l++){
8                        if(nums[i]+nums[j]+nums[k]==nums[l]){
9                            count++;
10                        }
11                    }
12                }
13            }
14        }
15        return count;
16    }
17}