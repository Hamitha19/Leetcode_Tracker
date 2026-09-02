// Last updated: 9/2/2026, 2:53:45 PM
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        String s="";
4        int i=0,j=0;
5        while(i<word1.length() || j<word2.length()){
6            if(i<word1.length()){
7            s+=word1.charAt(i);
8            i++;
9            }
10            if(j<word2.length()){
11            s+=word2.charAt(j);
12            j++;
13            }
14        }
15        return s;
16    }
17}