// Last updated: 8/14/2026, 2:23:59 PM
1class Solution {
2    public List<Integer> luckyNumbers(int[][] matrix) {
3        List<Integer> list=new ArrayList<>();
4        for(int i=0;i<matrix.length;i++){
5            int min=matrix[i][0];
6            int col=0;
7            for(int j=1;j<matrix[i].length;j++){
8                if(matrix[i][j]<min){
9                    min=matrix[i][j];
10                    col=j;
11                }
12            }
13            boolean lucky=true;
14            for(int r=0;r<matrix.length;r++){
15                if(matrix[r][col]>min){
16                    lucky=false;
17                    break;
18                }
19            }
20            if(lucky){
21                list.add(min);
22            }
23        }
24        return list;
25    }
26}