// Last updated: 7/14/2026, 2:08:44 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        Set<Character> ch=new HashSet<>();
        int left=0;
        for(int i=0;i<n;i++){
            if(!ch.contains(s.charAt(i))){
                ch.add(s.charAt(i));
                max=Math.max(max,i-left+1);
            }else{
                while(ch.contains(s.charAt(i))){
                ch.remove(s.charAt(left));
                left++;
                }
                    ch.add(s.charAt(i));
                
            }
        }
        return max;
    }
}