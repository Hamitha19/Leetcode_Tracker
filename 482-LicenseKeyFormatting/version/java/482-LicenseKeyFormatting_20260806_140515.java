// Last updated: 8/6/2026, 2:05:15 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        s=s.toUpperCase();
4        s=s.replaceAll("-","");
5        int c=0;
6        StringBuilder t=new StringBuilder();
7        for(int i=s.length()-1;i>=0;i--){
8                t.append(s.charAt(i));
9                c++;
10            if(c==k && i!=0){
11                t.append('-');
12                c=0;
13            }
14        }
15        return t.reverse().toString();
16    }
17}