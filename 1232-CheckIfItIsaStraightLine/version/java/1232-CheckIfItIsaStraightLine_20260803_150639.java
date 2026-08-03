// Last updated: 8/3/2026, 3:06:39 PM
1class Solution {
2    public boolean checkStraightLine(int[][] coordinates) {
3        int x1=coordinates[0][0];
4        int y1=coordinates[0][1];
5        int x2=coordinates[1][0];
6        int y2=coordinates[1][1];
7        for(int i=2;i<coordinates.length;i++){
8            int x=coordinates[i][0];
9            int y=coordinates[i][1];
10            if((y2-y1)*(x1-x)!=(y1-y)*(x2-x1)){
11                return false;
12            }
13        }
14        return true;
15    }
16}