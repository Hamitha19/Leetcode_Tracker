// Last updated: 10/13/2026, 11:22:39 AM
1class Solution {
2    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
3        List<Integer> list=new ArrayList<>();
4        for(int i=0;i<nums.length;i++){
5            for(int j=0;j<nums.length;j++){
6                if(nums[j]==key && Math.abs(i-j)<=k){
7                    list.add(i);
8                    break;
9                }
10            }
11        }
12        return list;
13    }
14}