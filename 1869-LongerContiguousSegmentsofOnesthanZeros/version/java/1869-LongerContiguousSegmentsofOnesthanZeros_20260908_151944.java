// Last updated: 9/8/2026, 3:19:44 PM
1class Solution {
2    public boolean isCovered(int[][] ranges, int left, int right) {
3        for(int i=left;i<=right;i++){
4            boolean covered=false;
5            for(int j=0;j<ranges.length;j++){
6                if(ranges[j][0]<=i && ranges[j][1]>=i){
7                    covered=true;
8                    break;
9                }
10            }
11            if(!covered){
12                return false;
13            }
14        }
15        return true;
16    }
17}