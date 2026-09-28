// Last updated: 9/28/2026, 12:31:50 PM
1class Solution {
2    public boolean isPalindrome(String st){
3        int l=0,r=st.length()-1;
4        while(l<r){
5            if(st.charAt(l)!=st.charAt(r)){
6                return false;
7            }
8            l++;
9            r--;
10        }
11        return true;
12    }
13    public String longestPalindrome(String s) {
14        String longest="";
15        for(int i=0;i<s.length();i++){
16            for(int k=i;k<s.length();k++){
17            String sub=s.substring(i,k+1);
18            if(isPalindrome(sub)){
19                if(sub.length()>longest.length()){
20                    longest=sub;
21                }
22            }
23        }
24        }
25    
26        return longest;
27    }
28}