// Last updated: 7/14/2026, 2:04:23 PM
class Solution {
    public int minElement(int[] nums) {
        
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int dig=0;
            while(n>0){
                int temp=n%10;
                dig+=temp;
                n/=10;
            }
            arr[i]=dig;
        }
        Arrays.sort(arr);
        return arr[0];
    }
}