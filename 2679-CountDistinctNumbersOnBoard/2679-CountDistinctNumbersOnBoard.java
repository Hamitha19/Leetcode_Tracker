// Last updated: 7/14/2026, 2:04:54 PM
class Solution {
    public int distinctIntegers(int n) {
        int max=0;
        if(n<=2){
            return 1;

        }
        for(int i=1;i<n;i++){
            if(n%i==1){
               if(i>max){
                max=i;
               }
               
            }
            
        }
       return max;
    }
}