// Last updated: 7/14/2026, 2:07:06 PM
class Solution {
    public int longestPalindrome(String s) {
        int []freq=new int[128];
        int sum=0;
        boolean odd=false;
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==0){
                sum+=freq[i];
            }
            
        else if(freq[i]%2!=0){
                sum+=freq[i]-1;
                odd=true;
            }
        }
        if(odd){
            sum+=1;
        }
            
        
        return sum;
    }
}