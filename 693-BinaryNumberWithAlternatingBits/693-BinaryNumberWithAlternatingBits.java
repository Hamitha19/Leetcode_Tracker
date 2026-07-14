// Last updated: 7/14/2026, 2:06:31 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
         String s=Integer.toBinaryString(n);
         for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                return false;
            }
         }
        return true;
    }
}