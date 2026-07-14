// Last updated: 7/14/2026, 2:08:25 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] a=s.split(" ");
        return a[a.length-1].length();
        
    }
}