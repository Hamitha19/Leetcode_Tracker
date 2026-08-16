// Last updated: 8/16/2026, 7:12:32 PM
1class Solution {
2    public List<String> stringMatching(String[] words) {
3        List<String> res=new ArrayList<>();
4        for(int i=0;i<words.length;i++){
5            for(int j=0;j<words.length;j++){
6                if(i!=j && words[j].contains(words[i])){
7                    res.add(words[i]);
8                    break;
9                }
10            }
11        }
12        return res;
13    }
14}