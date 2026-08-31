// Last updated: 8/31/2026, 12:38:41 PM
1class Solution {
2    public boolean canFormArray(int[] arr, int[][] pieces) {
3        int [][]map=new int[101][];
4        for(int []piece:pieces){
5            map[piece[0]]=piece;
6        }
7        int i=0;
8        while(i<arr.length){
9            int []piece=map[arr[i]];
10            if (piece == null) {
11                return false;
12            }
13            for(int num:piece){
14                if(i>=arr.length || arr[i]!=num){
15                    return false;
16                }
17                i++;
18            }
19        }
20        return true;
21    }
22}