// Last updated: 8/17/2026, 12:27:28 PM
1class Solution {
2    public String reformat(String s) {
3        String l="";
4        String d="";
5        for(int i=0;i<s.length();i++){
6            if(Character.isDigit(s.charAt(i))){
7                d+=s.charAt(i);
8            }else if(Character.isLetter(s.charAt(i))){
9                l+=s.charAt(i);
10            }
11        }
12        if(Math.abs(d.length()-l.length())>1){
13            return "";
14        }
15        if(l.length()<d.length()){
16            String temp=l;
17            l=d;
18            d=temp;
19        }
20        StringBuilder sb=new StringBuilder();
21        for(int i=0;i<d.length();i++){
22            sb.append(l.charAt(i));
23            sb.append(d.charAt(i));
24        }
25        if(l.length()>d.length()){
26            sb.append(l.charAt(l.length()-1));
27        }
28        return sb.toString();
29    }
30}