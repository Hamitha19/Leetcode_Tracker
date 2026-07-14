// Last updated: 7/14/2026, 2:05:28 PM
class Solution {
    public int arraySign(int[] nums) {
       int prod=1;
       for(int num:nums){
        if(num==0){
          return 0;
       }else if(num<0){
        prod=prod*-1;
       }
       } 
       return prod;
       
    }
}