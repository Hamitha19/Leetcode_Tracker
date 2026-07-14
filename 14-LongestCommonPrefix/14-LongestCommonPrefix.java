// Last updated: 7/14/2026, 2:08:38 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
            if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                return str;
            }
            
        }
        str+=ch;
        }
        return str;
    }
}