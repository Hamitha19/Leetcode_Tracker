// Last updated: 8/16/2026, 7:03:33 PM
1class Solution {
2    public List<Integer> minSubsequence(int[] nums) {
3        Arrays.sort(nums);
4        int total=0;
5        for(int i=0;i<nums.length;i++){
6            total+=nums[i];
7        }
8        List<Integer> res=new ArrayList<>();
9        int sum=0;
10        for(int i=nums.length-1;i>=0;i--){
11            sum+=nums[i];
12            res.add(nums[i]);
13            if(sum>total-sum){
14                break;
15            }
16        }
17        return res;
18
19    }
20}