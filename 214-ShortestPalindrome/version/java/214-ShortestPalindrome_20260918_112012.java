// Last updated: 9/18/2026, 11:20:12 AM
1class Solution {
2    public String shortestPalindrome(String s) {
3        String t="";
4        for(int i=s.length()-1;i>=0;i--){
5            t+=s.charAt(i);
6        }
7        String combined=s+"#"+t;
8        int []lps=new int[combined.length()];
9        int i=1;
10        int len=0;
11        while(i<combined.length()){
12            if(combined.charAt(i)==combined.charAt(len)){
13                len++;
14                lps[i]=len;
15                i++;
16            }else{
17                if(len!=0){
18                    len=lps[len-1];
19                }else{
20                    lps[i]=0;
21                    i++;
22                }
23            }
24        }
25        int palindrome=lps[combined.length()-1];
26        String rem=s.substring(palindrome);
27        String add=new StringBuilder(rem).reverse().toString();
28        return add+s;
29    }
30}