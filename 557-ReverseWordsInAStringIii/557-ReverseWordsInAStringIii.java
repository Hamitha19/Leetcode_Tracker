// Last updated: 7/14/2026, 2:06:46 PM
class Solution {
    public String reverseWords(String s) {
        String []str=s.split(" ");
        String st="";
        for(int i=0;i<str.length;i++){
            for(int j=str[i].length()-1;j>=0;j--){
                st+=str[i].charAt(j);
            }
            if(i!=str.length-1){
            st+=" ";
            }
        }
        
        return st;
    }
}