// Last updated: 8/14/2026, 2:43:26 PM
1class Solution {
2    public int[] createTargetArray(int[] nums, int[] index) {
3        ArrayList<Integer> list=new ArrayList<>();
4        for(int i=0;i<nums.length;i++){
5            list.add(index[i],nums[i]);
6        }
7        int []ans=new int[nums.length];
8        for(int i=0;i<list.size();i++){
9            ans[i]=list.get(i);
10        }
11        return ans;
12    }
13}