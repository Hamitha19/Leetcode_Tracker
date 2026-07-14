// Last updated: 7/14/2026, 2:04:20 PM
class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append(s.charAt(i));
            }else if(s.charAt(i)=='#'){
                sb.append(sb);
            }else if(s.charAt(i)=='%'){
                sb.reverse();
            }else if(s.charAt(i)=='*'){
                if(sb.length()!=0)
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}