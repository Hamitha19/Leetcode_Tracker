// Last updated: 7/14/2026, 2:05:21 PM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}