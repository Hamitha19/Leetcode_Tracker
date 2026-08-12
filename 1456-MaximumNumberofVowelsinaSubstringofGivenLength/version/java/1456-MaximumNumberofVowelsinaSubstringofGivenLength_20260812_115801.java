// Last updated: 8/12/2026, 11:58:01 AM
1class Solution {
2    public int maxVowels(String s, int k) {
3        int count=0;
4        int max=0;
5        for(int i=0;i<s.length();i++){
6            if(isVowel(s.charAt(i))){
7                count++;
8            }
9            if(i>=k && isVowel(s.charAt(i-k))){
10                count--;
11            }
12            if(i>=k-1){
13                max=Math.max(max,count);
14            }
15        }
16        return max;
17    }
18        public boolean isVowel(char c){
19            return c=='a' ||c=='e' ||c=='o' ||c=='i' ||c=='u';
20
21        }
22    
23}