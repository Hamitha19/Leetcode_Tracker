// Last updated: 7/14/2026, 2:06:37 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Double.NEGATIVE_INFINITY;
        for(int i=0;i<=nums.length-k;i++){
            int sum=0;
            double avg=0;
            for(int j=0;j<k;j++){
                sum+=nums[i+j];
            }
            avg=(double)sum/k;
            if(avg>max){
                max=avg;
            }
        }
        return max;
    }
}