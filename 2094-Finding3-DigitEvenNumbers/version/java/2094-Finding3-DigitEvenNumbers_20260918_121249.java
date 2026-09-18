// Last updated: 9/18/2026, 12:12:49 PM
1class Solution {
2    public String[] divideString(String s, int k, char fill) {
3        int l=(s.length()+k-1)/k;
4        String []str=new String[l];
5        int j=0;
6        for(int i=0;i<s.length();i+=k){
7            String temp="";
8            for(int m=i;m<i+k;m++){
9                if(m<s.length()){
10                    temp+=s.charAt(m);
11                }else{
12                    temp+=fill;
13                }
14            }
15            str[j]=temp;
16            j++;
17        }
18        return str;
19    }
20}