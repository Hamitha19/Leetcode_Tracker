// Last updated: 10/6/2026, 11:17:04 AM
1class Solution {
2    public int prefixCount(String[] words, String pref) {
3        int count=0;
4        for(int i=0;i<words.length;i++){
5            if(words[i].startsWith(pref)){
6                count++;
7            }
8        }
9        return count;
10    }
11}