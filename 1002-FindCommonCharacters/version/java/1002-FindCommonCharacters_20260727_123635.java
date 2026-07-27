// Last updated: 7/27/2026, 12:36:35 PM
1class Solution {
2    public List<String> commonChars(String[] words) {
3        List<String> list=new ArrayList<>();
4        for(int i=0;i<words[0].length();i++){
5            boolean found=true;
6            char ch=words[0].charAt(i);
7            for(int j=1;j<words.length;j++){
8                int index=words[j].indexOf(ch);
9                if(index==-1){
10                    found=false;
11                    break;
12                }
13                words[j]=words[j].substring(0,index)+"*"+words[j].substring(index+1);
14            }
15            if(found){
16                list.add(String.valueOf(ch));
17            }
18        }
19        return list;
20    }
21}