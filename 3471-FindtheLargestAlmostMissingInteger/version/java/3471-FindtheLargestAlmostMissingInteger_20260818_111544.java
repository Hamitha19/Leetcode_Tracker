// Last updated: 8/18/2026, 11:15:44 AM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int []count=new int[51];
4        for(int i=0;i<=nums.length-k;i++){
5            HashSet<Integer> set=new HashSet<>();
6            for(int j=i;j<i+k;j++){
7                set.add(nums[j]);
8            }
9            for(int x:set){
10                count[x]++;
11            }
12        }
13        int ans=-1;
14        for(int i=0;i<=50;i++){
15            if(count[i]==1){
16                ans=i;
17            }
18        }
19        return ans;
20    }
21}