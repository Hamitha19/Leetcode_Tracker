// Last updated: 7/14/2026, 2:04:44 PM
class Solution {
    public String removeTrailingZeros(String num) {
        return num.replaceAll("0+$","");
        }
}