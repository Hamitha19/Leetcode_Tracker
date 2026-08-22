// Last updated: 8/22/2026, 2:39:11 PM
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int n=mat.length;
4        int sum=0;
5        for(int i=0;i<n;i++){
6            sum+=mat[i][i];
7            sum+=mat[i][n-i-1];
8        }
9        if(n%2!=0){
10        return sum-mat[n/2][n/2];
11        }
12        return sum;
13    }
14}