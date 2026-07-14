// Last updated: 7/14/2026, 2:04:57 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dig=0;
        for(int i=0;i<nums.length;i++){
        int n=nums[i];
         sum+=n;
         while(n>0){
                int temp=n%10;
                dig+=temp;
                n/=10;
            } 
        }
        return Math.abs(sum-dig);
    }
}