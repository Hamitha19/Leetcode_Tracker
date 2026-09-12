// Last updated: 9/12/2026, 11:24:03 AM
1class Solution {
2    public int maximumUniqueSubarray(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        int left=0;
5        int sum=0;
6        int max=0;
7        for(int i=0;i<nums.length;i++){
8            while(set.contains(nums[i])){
9                set.remove(nums[left]);
10                sum-=nums[left];
11                left++;
12            }
13            set.add(nums[i]);
14            sum+=nums[i];
15            max=Math.max(max,sum);
16        }
17        return max;
18    }
19}