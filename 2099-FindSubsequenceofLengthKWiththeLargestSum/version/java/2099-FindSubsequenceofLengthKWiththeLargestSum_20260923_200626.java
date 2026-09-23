// Last updated: 9/23/2026, 8:06:26 PM
1class Solution {
2    public boolean checkValid(int[][] matrix) {
3        for(int i=0;i<matrix.length;i++){
4            boolean []row=new boolean[101];
5            for(int j=0;j<matrix.length;j++){
6                int value=matrix[i][j];
7            if(row[value]){
8                return false;
9            }
10            row[value]=true;
11            }
12        }
13        for(int i=0;i<matrix.length;i++){
14            boolean []col=new boolean[101];
15            for(int j=0;j<matrix.length;j++){
16                int value=matrix[j][i];
17            if(col[value]){
18                return false;
19            }
20            col[value]=true;
21            }
22        }
23        return true;
24    }
25}