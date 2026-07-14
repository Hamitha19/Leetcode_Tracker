// Last updated: 7/14/2026, 2:06:39 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int p1=nums[n-1]*nums[n-2]*nums[n-3];
        int p2=nums[0]*nums[1]*nums[n-1];
        return Math.max(p1,p2);
    }
}