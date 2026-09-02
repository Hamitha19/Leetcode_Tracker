// Last updated: 9/2/2026, 3:52:02 PM
1class Solution {
2    public int secondHighest(String s) {
3        int max=0;
4        for(int i=0;i<s.length();i++){
5            if(Character.isDigit(s.charAt(i))){
6                int num=s.charAt(i)-'0';
7                max=Math.max(max,num);
8            }
9        }
10        int sec=-1;
11        for(int i=0;i<s.length();i++){
12            if(Character.isDigit(s.charAt(i))){
13                int num=s.charAt(i)-'0';
14                if(num!=max){
15                sec=Math.max(sec,num);
16                }
17            }
18        }
19        return sec;
20    }
21}