// Last updated: 7/14/2026, 2:08:20 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n:nums)
        if(i<2 || n>nums[i-2])
        nums[i++]=n;
        return i;
    }
}