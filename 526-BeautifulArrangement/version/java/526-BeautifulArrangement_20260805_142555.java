// Last updated: 8/5/2026, 2:25:55 PM
1class Solution {
2    public boolean isBoomerang(int[][] points) {
3        int x1=points[0][0];
4        int y1=points[0][1];
5        int x2=points[1][0];
6        int y2=points[1][1];
7        int x3=points[2][0];
8        int y3=points[2][1];
9        return (y2-y1)*(x3-x1)!=(y3-y1)*(x2-x1);
10    }
11}