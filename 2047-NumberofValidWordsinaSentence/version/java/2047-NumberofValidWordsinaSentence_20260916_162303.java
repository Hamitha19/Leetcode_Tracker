// Last updated: 9/16/2026, 4:23:03 PM
1class Solution {
2    public boolean checkAlmostEquivalent(String word1, String word2) {
3        int count1[]=new int[26];
4        int count2[]=new int[26];
5        for(int i=0;i<word1.length();i++){
6            count1[word1.charAt(i)-'a']++;
7        }
8        for(int i=0;i<word2.length();i++){
9            count2[word2.charAt(i)-'a']++;
10        }
11        for(int i=0;i<26;i++){
12            if(Math.abs(count1[i]-count2[i])>3){
13                return false;
14            }
15        }
16        return true;
17
18    }
19}