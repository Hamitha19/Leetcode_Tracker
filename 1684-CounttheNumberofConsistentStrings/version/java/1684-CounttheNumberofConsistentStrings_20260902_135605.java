// Last updated: 9/2/2026, 1:56:05 PM
1class Solution {
2    public int countConsistentStrings(String allowed, String[] words) {
3       int count=0;
4       for(String word:words){
5        boolean found=true;
6        for(int i=0;i<word.length();i++){
7            if(!allowed.contains(String.valueOf(word.charAt(i)))){
8                found=false;
9                break;
10            }
11        }
12        if(found){
13            count++;
14        }
15       } 
16       return count;
17    }
18}