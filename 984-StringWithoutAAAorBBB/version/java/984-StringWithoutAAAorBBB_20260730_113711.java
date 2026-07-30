// Last updated: 7/30/2026, 11:37:11 AM
1class Solution {
2    public String strWithout3a3b(int a, int b) {
3        StringBuilder sb=new StringBuilder();
4        while(a>0 ||b>0){
5            int n=sb.length();
6            if(n>=2 && sb.charAt(n-1)==sb.charAt(n-2)){
7                if(sb.charAt(n-1)=='a'){
8                    sb.append('b');
9                    b--;
10                }else{
11                    sb.append('a');
12                    a--;
13                }
14            }
15            else{
16                if(a>b){
17                sb.append('a');
18                a--;
19            }else {
20                sb.append('b');
21                b--;
22            }
23        }
24        }
25        return sb.toString();
26    }
27}