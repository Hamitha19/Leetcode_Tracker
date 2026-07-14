// Last updated: 7/14/2026, 2:07:18 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        
        for(long i=1;i<num;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}