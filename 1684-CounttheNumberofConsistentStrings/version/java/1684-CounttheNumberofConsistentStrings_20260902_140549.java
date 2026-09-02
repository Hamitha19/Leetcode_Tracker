// Last updated: 9/2/2026, 2:05:49 PM
1class Solution {
2    public boolean halvesAreAlike(String s) {
3        String a="";
4        String b="";
5        s=s.toLowerCase();
6        for(int i=0;i<s.length()/2;i++){
7            a+=s.charAt(i);
8        }
9        for(int i=s.length()/2;i<s.length();i++){
10            b+=s.charAt(i);
11        }
12        int c1=0;
13        int c2=0;
14        for(int i=0;i<a.length();i++){
15            char ch=a.charAt(i);
16            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
17                c1++;
18            }
19        }
20        for(int i=0;i<b.length();i++){
21            char ch=b.charAt(i);
22            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
23                c2++;
24            }
25        }
26        if(c1==c2){
27            return true;
28        }
29        return false;
30    }
31}