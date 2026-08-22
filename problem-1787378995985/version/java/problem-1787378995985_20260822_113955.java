// Last updated: 8/22/2026, 11:39:55 AM
1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int num=1;
4        while(k>0){
5           boolean found=false;
6        for(int i=0;i<arr.length;i++){
7            if(num==arr[i]){
8                found=true;
9                break;
10            }
11        }
12            if(!found){
13                k--;;
14            }
15            num++;
16        }
17        return num-1;
18    }
19}