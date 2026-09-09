// Last updated: 9/9/2026, 7:14:25 PM
1class Solution {
2    public int canBeTypedWords(String text, String brokenLetters) {
3        int count=0;
4        String []s=text.split(" ");
5        for(int i=0;i<s.length;i++){
6            boolean found=true;
7            for(int j=0;j<brokenLetters.length();j++){
8            if(s[i].indexOf(brokenLetters.charAt(j))!=-1){
9                found=false;
10                break;
11            }
12            }
13            if(found){
14                count++;
15            }
16        }
17        return count;
18    }
19}