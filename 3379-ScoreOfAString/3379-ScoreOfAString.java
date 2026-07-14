// Last updated: 7/14/2026, 2:04:28 PM
class Solution {
    public int scoreOfString(String s) {
       int a = 0;
        for(int i=0;i<s.length()-1;i++)
        {
            a=a+ Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return a;
    }
}
    