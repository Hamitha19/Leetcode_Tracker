// Last updated: 8/3/2026, 12:30:06 PM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        Arrays.sort(arr);
4        List<List<Integer>> ans=new ArrayList<>();
5        int min=Integer.MAX_VALUE;
6        for(int i=1;i<arr.length;i++){
7            min=Math.min(min,arr[i]-arr[i-1]);
8        }
9        for(int i=1;i<arr.length;i++){
10            if(arr[i]-arr[i-1]==min){
11                List<Integer> list=new ArrayList<>();
12                list.add(arr[i-1]);
13                list.add(arr[i]);
14                ans.add(list);
15            }
16        }
17        return ans;
18    }
19}