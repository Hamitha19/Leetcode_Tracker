// Last updated: 8/13/2026, 11:41:20 AM
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        int i=0,j=0;
4        while(i<version1.length() || j<version2.length()){
5            int num1=0;
6            int num2=0;
7            while(i<version1.length() && version1.charAt(i)!='.'){
8                num1=num1*10+(version1.charAt(i)-'0');
9                i++;
10            }
11            while(j<version2.length() && version2.charAt(j)!='.'){
12                num2=num2*10+(version2.charAt(j)-'0');
13                j++;
14            }
15            if(num1<num2){
16                return -1;
17            }
18            if(num1>num2){
19                return 1;
20            }
21            i++;
22            j++;
23        }
24        return 0;
25    }
26}