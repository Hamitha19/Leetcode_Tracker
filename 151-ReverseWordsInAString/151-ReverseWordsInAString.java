// Last updated: 7/14/2026, 2:08:08 PM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String []str=s.split("\\s+");
        String ss="";
        for(int i=str.length-1;i>=0;i--){
            if(i!=0){
            ss+=str[i]+" ";
            }else{
                ss+=str[i];
            }

        }
        return ss;
    }
}