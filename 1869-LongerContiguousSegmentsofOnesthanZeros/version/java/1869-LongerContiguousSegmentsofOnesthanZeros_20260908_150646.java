// Last updated: 9/8/2026, 3:06:46 PM
1class Solution {
2    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
3        int f=0;
4        int s=0;
5        int t=0;
6        for(int i=0;i<firstWord.length();i++){
7            f=f*10+(firstWord.charAt(i)-'a');
8        }
9        for(int i=0;i<secondWord.length();i++){
10            s=s*10+(secondWord.charAt(i)-'a');
11        }
12        for(int i=0;i<targetWord.length();i++){
13            t=t*10+(targetWord.charAt(i)-'a');
14        }
15        return f+s==t;
16    }
17}