// Last updated: 7/14/2026, 2:04:25 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                sum+=nums[i];
            }else if(nums[i]<10){
                num+=nums[i];
            }
        }
        if(sum==num){
            return false;
        }
        return true;
    }
}