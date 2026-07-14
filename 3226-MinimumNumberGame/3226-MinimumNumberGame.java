// Last updated: 7/14/2026, 2:04:34 PM
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int [] arr=new int[nums.length];
        int temp=nums[0];
        for(int i=0;i<nums.length;i+=2){
            int x = nums[i];
            int y = nums[i + 1];
            arr[i] = y;
            arr[i + 1] = x;
        }
       
        return arr;
    }
}