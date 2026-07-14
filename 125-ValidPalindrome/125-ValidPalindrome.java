// Last updated: 7/14/2026, 2:08:11 PM
class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }
        return false;
    }
}