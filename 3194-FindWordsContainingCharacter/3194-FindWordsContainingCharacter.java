// Last updated: 7/14/2026, 2:04:37 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                list.add(i);
            }
        }
        return list;
    }
}