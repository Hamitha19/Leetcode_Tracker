// Last updated: 7/14/2026, 2:06:09 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int index=nums[0];
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
                index=nums[i];
            }
        }
        return index;
    }
}