// Last updated: 9/2/2026, 2:45:25 PM
1class Solution {
2    public int minOperations(String s) {
3        int c1=0;
4        int c2=0;
5        for(int i=0;i<s.length();i++){
6            if(i%2==0){
7                if(s.charAt(i)!='0'){
8                    c1++;
9                }if(s.charAt(i)!='1'){
10                    c2++;
11                }
12            }else{
13                if(s.charAt(i)!='1'){
14                    c1++;
15                }if(s.charAt(i)!='0'){
16                    c2++;
17                }
18            }
19        }
20        
21        return Math.min(c1,c2);
22    }
23}