// Last updated: 7/14/2026, 2:08:05 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        String i="";
        while(columnNumber>0){
            columnNumber--;
            
            i=(char)('A'+columnNumber%26)+i;
            columnNumber=columnNumber/26;
        }
        return i;
    }
}