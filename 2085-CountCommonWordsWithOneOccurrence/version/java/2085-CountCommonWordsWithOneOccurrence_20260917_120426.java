// Last updated: 9/17/2026, 12:04:26 PM
1class Solution {
2    public int countWords(String[] words1, String[] words2) {
3        HashMap<String, Integer> map1=new HashMap<>();
4        for(int i=0;i<words1.length;i++){
5            map1.put(words1[i],map1.getOrDefault(words1[i],0)+1);
6        }
7        HashMap<String, Integer> map2=new HashMap<>();
8        for(int i=0;i<words2.length;i++){
9            map2.put(words2[i],map2.getOrDefault(words2[i],0)+1);
10        }
11        int count=0;
12        for(String word:words1){
13            if(map1.get(word)==1 && map2.getOrDefault(word,0)==1){
14                count++;
15            }
16        }
17        return count;
18    }
19}