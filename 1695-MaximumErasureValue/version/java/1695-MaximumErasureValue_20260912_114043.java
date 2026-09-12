// Last updated: 9/12/2026, 11:40:43 AM
1class Solution {
2    public String reversePrefix(String word, char ch) {
3        String s="";
4        if(word.indexOf(ch)==-1){
5            return word;
6        }
7        int index=0;
8        for(int i=0;i<word.length();i++){
9            s+=word.charAt(i);
10            if(word.charAt(i)==ch){
11                index=i;
12                break;
13            }
14        }
15        String st="";
16        for(int i=s.length()-1;i>=0;i--){
17            st+=s.charAt(i);
18        }
19        for(int i=index+1;i<word.length();i++){
20            st+=word.charAt(i);
21        }
22        return st; 
23    }
24}