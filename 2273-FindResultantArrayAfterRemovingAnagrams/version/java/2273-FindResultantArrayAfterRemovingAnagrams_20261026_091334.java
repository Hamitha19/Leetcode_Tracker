// Last updated: 10/26/2026, 9:13:34 AM
1class Solution {
2    public List<String> removeAnagrams(String[] words) {
3        List<String> list=new ArrayList<>();
4        list.add(words[0]);
5        for(int i=1;i<words.length;i++){
6            char[] ch1=list.get(list.size()-1).toCharArray();
7            char[] ch2=words[i].toCharArray();
8            Arrays.sort(ch1);
9            Arrays.sort(ch2);
10            if(Arrays.equals(ch1,ch2)){
11                continue;
12            }else{
13                list.add(words[i]);
14            }
15
16        }
17        return list;
18    }
19}