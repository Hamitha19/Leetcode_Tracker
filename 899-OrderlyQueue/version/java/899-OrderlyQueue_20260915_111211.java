// Last updated: 9/15/2026, 11:12:11 AM
1class Solution {
2    public String orderlyQueue(String s, int k) {
3        if(k>1){
4            char []s2=s.toCharArray();
5            Arrays.sort(s2);
6            return new String(s2);
7        }
8        String res=s;
9        for(int i=1;i<s.length();i++){
10            String tmp=s.substring(i)+s.substring(0,i);
11            if(res.compareTo(tmp)>0) res=tmp;
12        }
13        return res;
14    }
15}