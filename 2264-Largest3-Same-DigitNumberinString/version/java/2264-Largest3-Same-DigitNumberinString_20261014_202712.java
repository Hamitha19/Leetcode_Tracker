// Last updated: 10/14/2026, 8:27:12 PM
1class Solution {
2    public String largestGoodInteger(String num) {
3        String max="";
4        for(int i=0;i<num.length()-2;i++){
5            char ch=num.charAt(i);
6            if(ch==num.charAt(i+1) && ch==num.charAt(i+2)){
7                String temp=num.substring(i,i+3);
8            
9            if(max.compareTo(temp)<0){
10                max=temp;
11            }
12            }
13        }
14        return max;
15    }
16}