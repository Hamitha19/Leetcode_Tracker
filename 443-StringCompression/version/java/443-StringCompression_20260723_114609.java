// Last updated: 7/23/2026, 11:46:09 AM
1class Solution {
2    public String customSortString(String order, String s) {
3        int []freq=new int[26];
4        for(int i=0;i<s.length();i++){
5            freq[s.charAt(i)-'a']++;
6        }
7        StringBuilder sb=new StringBuilder();
8        for(int i=0;i<order.length();i++){
9            char ch=order.charAt(i);
10            while(freq[ch-'a']>0){
11                sb.append(ch);
12                freq[ch-'a']--;
13            }
14        }
15        for(int i=0;i<26;i++){
16            while(freq[i]>0){
17                sb.append((char)(i+'a'));
18                freq[i]--;
19            }
20        }
21        return sb.toString();
22    }
23}