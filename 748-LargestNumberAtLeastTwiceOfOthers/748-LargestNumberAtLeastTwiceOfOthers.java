// Last updated: 7/14/2026, 2:06:25 PM
class Solution {
    public int dominantIndex(int[] nums) {
       int max=Integer.MIN_VALUE;
       int index=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
            index=i;
        }
       }
       boolean found=false;
       for(int i=0;i<nums.length;i++){
        if(i!=index && nums[i]+nums[i]>max){
            found=true;
        }
       } 
       if(found){
        return -1;
       }
       return index;
    }
}