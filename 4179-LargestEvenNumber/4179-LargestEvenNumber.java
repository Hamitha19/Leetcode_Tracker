// Last updated: 7/14/2026, 2:04:14 PM
class Solution {
    public String largestEven(String s) {
        int n=s.length()-1;
        for(int i=n;i>=0;i--){
            if(s.charAt(i)=='2'){
                return s.substring(0,i+1);
                
            }

        }
        return "";        
    }
}