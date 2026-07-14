// Last updated: 7/14/2026, 2:06:52 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ones++;
            }else if(nums[i]!=1){
                ones=0;
            }
            if(ones>max){
                max=ones;
            }
        }
        return max;
    }
}