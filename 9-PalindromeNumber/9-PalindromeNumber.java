// Last updated: 7/14/2026, 2:08:39 PM
class Solution {
    public boolean isPalindrome(int x) {
        
    if(x<0 || x!=0 && x%10 ==0 ) return false;
        int check=0;
        while(x>check){
            check = check*10 + x%10;
            x/=10;
        }
        return (x==check || x==check/10);

    }
    
    
}