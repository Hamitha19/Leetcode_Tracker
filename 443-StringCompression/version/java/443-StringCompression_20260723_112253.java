// Last updated: 7/23/2026, 11:22:53 AM
1class Solution {
2    public int compress(char[] chars) {
3        int k=0;
4        for(int i=0;i<chars.length;){
5            char ch=chars[i];
6            int count=0;
7            while(i<chars.length && chars[i]==ch){
8                count++;
9                i++;
10            }
11            chars[k++]=ch;
12            if(count>1){
13                String s=String.valueOf(count);
14                for(int j=0;j<s.length();j++){
15                    chars[k++]=s.charAt(j);
16                }
17            }
18        }
19        return k;
20    }
21}