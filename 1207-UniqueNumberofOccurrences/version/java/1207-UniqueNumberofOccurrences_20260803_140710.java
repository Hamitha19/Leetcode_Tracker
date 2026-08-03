// Last updated: 8/3/2026, 2:07:10 PM
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        List<Integer> list=new ArrayList<>();
4        Arrays.sort(arr);
5        for(int i=0;i<arr.length;){
6            int count=1;
7            while(i+1<arr.length && arr[i]==arr[i+1]){
8                
9                    count++;
10                    i++;
11                
12            }
13            list.add(count);
14            i++;
15        }
16        Set<Integer> set=new HashSet<>(list);
17        
18        return list.size()==set.size();
19    }
20}