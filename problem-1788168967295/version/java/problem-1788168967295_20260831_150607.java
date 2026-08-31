// Last updated: 8/31/2026, 3:06:07 PM
1class Solution {
2    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
3        StringBuilder sb1=new StringBuilder();
4        StringBuilder sb2=new StringBuilder();
5        for(int i=0;i<word1.length;i++){
6            sb1.append(word1[i]);
7        }
8        for(int i=0;i<word2.length;i++){
9            sb2.append(word2[i]);
10        }
11        if((sb1.toString()).equals(sb2.toString())){
12            return true;
13        }
14        return false;
15    }
16}