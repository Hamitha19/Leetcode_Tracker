// Last updated: 7/14/2026, 2:07:39 PM
class Solution {
    public int missingNumber(int[] nums) {
        int  sum=nums.length*(nums.length+1)/2;
        int num=0;
        for(int i=0;i<nums.length;i++){
            num+=nums[i];
        }
        return sum-num;
    }
}