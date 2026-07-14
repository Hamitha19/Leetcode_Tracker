// Last updated: 7/14/2026, 2:08:10 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num:nums){
           result=result^num; 
        }
        
        return result;
    }
}