// Last updated: 8/13/2026, 12:12:38 PM
1class Solution {
2    public int[] decompressRLElist(int[] nums) {
3        ArrayList<Integer> list=new ArrayList<>();
4        for(int i=0;i<nums.length;i+=2){
5            for(int j=0;j<nums[i];j++){
6                list.add(nums[i+1]);
7            }
8
9        }
10        int []res=new int[list.size()];
11        for(int i=0;i<list.size();i++){
12            res[i]=list.get(i);
13        }
14        return res;
15    }
16}