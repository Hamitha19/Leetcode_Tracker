// Last updated: 9/10/2026, 10:06:37 AM
1class Solution {
2    public boolean areOccurrencesEqual(String s) {
3        int []count=new int[26];
4        for(int i=0;i<s.length();i++){
5            count[s.charAt(i)-'a']++;
6        }
7        int a=count[s.charAt(0)-'a'];
8        for(int i=1;i<26;i++){
9            if(count[i]!=a && count[i]!=0){
10                return false;
11            }
12        }
13        return true;
14    }
15}