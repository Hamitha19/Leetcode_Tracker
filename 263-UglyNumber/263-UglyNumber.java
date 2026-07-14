// Last updated: 7/14/2026, 2:07:40 PM
class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
           return false;
        }
        int[]p={2,3,5};
        for(int prime:p){
            while(n%prime==0){
                n/=prime;
            }
        }
        return n==1;
    }
}