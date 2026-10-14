// Last updated: 10/14/2026, 2:34:42 PM
1class Solution {
2    public List<Integer> intersection(int[][] nums) {
3        List<Integer> list=new ArrayList<>();
4        int []count=new int[1001];
5        for(int i=0;i<nums.length;i++){
6            for(int j=0;j<nums[i].length;j++){
7                count[nums[i][j]]++;
8            }
9        }
10        for(int i=0;i<1001;i++){
11            if(count[i]==nums.length){
12                list.add(i);
13            }
14        }
15        return list;
16
17    }
18}