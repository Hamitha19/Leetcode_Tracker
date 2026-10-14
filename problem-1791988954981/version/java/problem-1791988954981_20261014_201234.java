// Last updated: 10/14/2026, 8:12:34 PM
1class Solution {
2    public String removeDigit(String number, char digit) {
3        String res="";
4        for(int i=0;i<number.length();i++){
5            if(number.charAt(i)==digit ){
6                String temp=number.substring(0,i)+number.substring(i+1);
7                if(res.compareTo(temp)<0){
8                    res=temp;
9                }
10            }
11
12        }
13        return res;
14    }
15}