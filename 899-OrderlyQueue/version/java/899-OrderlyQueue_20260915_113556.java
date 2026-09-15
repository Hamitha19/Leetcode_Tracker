// Last updated: 9/15/2026, 11:35:56 AM
1class Solution {
2    public int[][] construct2DArray(int[] original, int m, int n) {
3        if(original.length!=m*n){
4            return new int[0][0];
5        }
6        int k=0;
7        int [][]res=new int[m][n];
8        for(int i=0;i<m;i++){
9            for(int j=0;j<n;j++){
10                res[i][j]=original[k];
11                k++;
12            }
13        }
14        return res;
15    }
16}