// Last updated: 9/2/2026, 12:00:25 PM
1class Solution {
2    public int countStudents(int[] students, int[] sandwiches) {
3        int z=0;
4        int o=0;
5        for(int i=0;i<students.length;i++){
6            if(students[i]==1){
7            o++;
8            }else{
9                z++;
10            }
11        }
12        for(int i=0;i<sandwiches.length;i++){
13            if(sandwiches[i]==0){
14            if(z==0){
15                return o;
16            }
17            z--;
18            }else{
19                if(o==0){
20                    return z;
21                }
22                o--;
23            }
24        }
25        return 0;
26    }
27}