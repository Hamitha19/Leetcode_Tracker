// Last updated: 7/14/2026, 2:07:45 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.trim();
        t=t.trim();
        s=s.replaceAll(" ","");
        t=t.replaceAll(" ","");
        s=s.toLowerCase();
        t=t.toLowerCase();
        char []c1=s.toCharArray();
        char []c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)){
            return true;
        }
        return false;
    }
}