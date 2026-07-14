// Last updated: 7/14/2026, 2:07:00 PM
class Solution {
    public int countSegments(String s) {
        int count=0;
        String []str=s.split(" ");
        for(int i=0;i<str.length;i++){
            if(!str[i].equals("")){
                count++;
            }
        }
        return count;
    }
}