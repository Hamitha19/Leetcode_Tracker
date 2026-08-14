// Last updated: 8/14/2026, 11:23:53 AM
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int []count=new int[26];
4        int left=0;
5        int max=0;
6        for(int i=0;i<s.length();i++){
7            count[s.charAt(i)-'a']++;
8            while(count[s.charAt(i)-'a']>2){
9                count[s.charAt(left)-'a']--;
10                left++;
11            }
12            max=Math.max(max,i-left+1);
13        }
14        return max;
15    }
16}