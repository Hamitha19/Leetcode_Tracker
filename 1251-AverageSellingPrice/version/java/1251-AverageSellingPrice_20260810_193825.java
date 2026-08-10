// Last updated: 8/10/2026, 7:38:25 PM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m=grid.length;
4        int n=grid[0].length;
5        int total=m*n;
6        k%=total;
7        int [][]ans=new int[m][n];
8        for(int i=0;i<m;i++){
9            for(int j=0;j<n;j++){
10                int index=i*n+j;
11                int newIndex=(index+k)%(m*n);
12                int newrow=newIndex/n;
13                int newcol=newIndex%n;
14                ans[newrow][newcol]=grid[i][j];
15            }
16        }
17        List<List<Integer>> res=new ArrayList<>();
18        for(int i=0;i<m;i++){
19            List<Integer> row=new ArrayList<>();
20            for(int j=0;j<n;j++){
21                row.add(ans[i][j]);
22            }
23            res.add(row);
24        }
25        return res;
26    }
27}