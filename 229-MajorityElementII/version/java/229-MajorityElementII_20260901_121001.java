// Last updated: 9/1/2026, 12:10:01 PM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        List<Integer> list=new ArrayList<>();
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int i=0;i<nums.length;i++){
6            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
7        }
8        for(int i=0;i<nums.length;i++){
9            if(map.get(nums[i])>nums.length/3 && !list.contains(nums[i])){
10                list.add(nums[i]);
11            }
12        }
13        return list;
14    }
15}