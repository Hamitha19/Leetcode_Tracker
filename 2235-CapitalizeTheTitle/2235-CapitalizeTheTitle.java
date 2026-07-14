// Last updated: 7/14/2026, 2:05:15 PM
class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();
        String []str=title.split(" ");
        String res="";
        for(int i=0;i<str.length;i++){
            String s=str[i];
            if(s.length()>2){
            char ch=Character.toUpperCase(s.charAt(0));
            res+=ch+s.substring(1);
            }else{
                res+=s;
            }
            if(i!=str.length-1){
                res+=" ";
            }
        }
        return res;
    }
}