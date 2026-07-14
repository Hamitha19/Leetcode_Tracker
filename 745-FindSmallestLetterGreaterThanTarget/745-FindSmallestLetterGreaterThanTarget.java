// Last updated: 7/14/2026, 2:06:26 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch=letters[0];
        Arrays.sort(letters);
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                return letters[i];
            }
        }
        return ch;
    }
}