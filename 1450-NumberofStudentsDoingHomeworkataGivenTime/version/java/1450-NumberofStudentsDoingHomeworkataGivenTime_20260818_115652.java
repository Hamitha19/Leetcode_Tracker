// Last updated: 8/18/2026, 11:56:52 AM
1class Solution {
2    public int isPrefixOfWord(String sentence, String searchWord) {
3        String []s=sentence.split(" ");
4        for(int i=0;i<s.length;i++){
5            if(s[i].startsWith(searchWord)){
6                return i+1;
7            }
8        }
9        return -1;
10    }
11}