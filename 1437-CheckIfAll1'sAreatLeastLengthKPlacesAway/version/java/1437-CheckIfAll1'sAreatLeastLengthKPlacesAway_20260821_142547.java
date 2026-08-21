// Last updated: 8/21/2026, 2:25:47 PM
1class Solution {
2    public String restoreString(String s, int[] indices) {
3        char []ch=new char[s.length()];
4        for(int i=0;i<indices.length;i++){
5            ch[indices[i]]=s.charAt(i);
6        }
7        return new String(ch);
8    }
9}