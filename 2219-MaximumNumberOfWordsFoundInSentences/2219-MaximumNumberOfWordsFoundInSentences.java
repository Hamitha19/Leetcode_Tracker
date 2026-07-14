// Last updated: 7/14/2026, 2:05:18 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            max=Math.max(max,(sentences[i].split(" ")).length);
        }
        return max;
    }
}