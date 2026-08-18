// Last updated: 8/18/2026, 12:12:29 PM
1class Solution {
2    public boolean canBeEqual(int[] target, int[] arr) {
3        int count[]=new int[1001];
4        for(int i=0;i<target.length;i++){
5            count[target[i]]++;
6        }
7        for(int i=0;i<arr.length;i++){
8            count[arr[i]]--;
9        }
10        for(int i=0;i<count.length;i++){
11            if(count[i]!=0){
12                return false;
13            }
14        }
15        return true;
16
17    }
18}