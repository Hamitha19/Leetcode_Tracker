// Last updated: 7/14/2026, 2:04:19 PM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n=0;
        int sum=0;
        for(int x:nums){
            
                max=Math.max(max,x);
                min=Math.min(min,x);
                
            
           
        }
        return 1L * k * (max-min);
    }
}