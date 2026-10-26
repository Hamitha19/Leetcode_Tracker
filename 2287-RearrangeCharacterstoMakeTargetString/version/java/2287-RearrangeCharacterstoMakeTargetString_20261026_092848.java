// Last updated: 10/26/2026, 9:28:48 AM
1class Solution {
2    public int rearrangeCharacters(String s, String target) {
3        int count1[]=new int[26];
4        for(int i=0;i<s.length();i++){
5            count1[s.charAt(i)-'a']++;
6        }
7        int count2[]=new int[26];
8        for(int i=0;i<target.length();i++){
9            count2[target.charAt(i)-'a']++;
10        }
11        int min=Integer.MAX_VALUE;
12        for(int i=0;i<target.length();i++){
13            int index=target.charAt(i)-'a';
14            int copies=count1[index]/count2[index];
15            min=Math.min(min,copies);
16        }
17        return min;
18    }
19}