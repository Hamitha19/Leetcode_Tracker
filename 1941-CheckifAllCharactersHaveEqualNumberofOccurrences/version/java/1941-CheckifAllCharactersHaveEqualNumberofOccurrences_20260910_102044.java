// Last updated: 9/10/2026, 10:20:44 AM
1class Solution {
2    public int getLucky(String s, int k) {
3        String st="";
4        for(int i=0;i<s.length();i++){
5            st+=(s.charAt(i)-'a')+1;
6        }
7        int n=0;
8        for(int i=0;i<st.length();i++){
9            n+=st.charAt(i)-'0';
10        }
11        for(int i=1;i<k;i++){
12            int d=0;
13            while(n>0){
14            int temp=n%10;
15            d+=temp;
16            n/=10;
17            }
18            n=d;
19        }
20        return n;
21    }
22}