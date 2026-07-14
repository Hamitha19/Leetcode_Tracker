// Last updated: 7/14/2026, 2:08:03 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}