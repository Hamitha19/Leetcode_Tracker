// Last updated: 8/10/2026, 8:02:00 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int []sorted=arr.clone();
4        Arrays.sort(sorted);
5        HashMap<Integer,Integer> map=new HashMap<>();
6        int rank=1;
7        for(int num:sorted){
8            if(!map.containsKey(num)){
9                map.put(num,rank);
10                rank++;
11            }
12        }
13        for(int i=0;i<arr.length;i++){
14            arr[i]=map.get(arr[i]);
15        }
16        return arr;
17    }
18}