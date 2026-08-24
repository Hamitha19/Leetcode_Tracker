// Last updated: 8/24/2026, 11:33:51 AM
1class Solution {
2    public String reorderSpaces(String text) {
3        int spaces=0;
4        for(int i=0;i<text.length();i++){
5            if(text.charAt(i)==' '){
6                spaces++;
7            }
8        }
9        String []words=text.trim().split("\\s+");
10        if(words.length==1){
11            return words[0]+" ".repeat(spaces);
12        }
13        int between=spaces/(words.length-1);
14        int extra=spaces%(words.length-1);
15        StringBuilder sb=new StringBuilder();
16        for(int i=0;i<words.length;i++){
17            sb.append(words[i]);
18            if(i<words.length-1){
19                sb.append(" ".repeat(between));
20            }
21        }
22        sb.append(" ".repeat(extra));
23        return sb.toString();
24    }
25}