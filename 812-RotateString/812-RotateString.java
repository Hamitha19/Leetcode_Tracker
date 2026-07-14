// Last updated: 7/14/2026, 2:06:21 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal); 
    }
}